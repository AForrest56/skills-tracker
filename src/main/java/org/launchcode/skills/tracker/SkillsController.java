package org.launchcode.skills.tracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsTracker(){
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";

    }

    @GetMapping("form")
    @ResponseBody
    public String formSkills(){
        return "<form method= 'POST'>" +
                "<input type= 'text' name= 'name'>" +
                "<label>Name" +
                "<br> My favorite language: <br>" +
                "<select name= 'firstChoice'>" +
                "<option value= 'Java'> Java </option>" +
                "<option value= 'JavaScript'> JavaScript </option>" +
                "<option value= 'Python'> Python </option>" +
                "</select>" +
                "<br> My second favorite language: <br>" +
                "<select name= 'secondChoice'>" +
                "<option value= 'Java'> Java </option>" +
                "<option value= 'JavaScript'> JavaScript </option>" +
                "<option value= 'Python'> Python </option>" +
                "</select>" +
                "<br> My third favorite language:<br>" +
                "<select name= 'thirdChoice'>" +
                "<option value= 'Java'> Java </option>" +
                "<option value= 'JavaScript'> JavaScript </option>" +
                "<option value= 'Python'> Python </option>" +
                "</select>" +
                "<br>" +
                "<input type= 'submit' value= 'Submit'>" +
                "</form>";
    }

    @PostMapping("form")
    @ResponseBody
    public String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice){
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
    }
}

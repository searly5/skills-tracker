package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String skills() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here is a list of skills we would like to learn!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>C#</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        return "<form method='post'>" +
                "Name: <input type='text' name='name'>" +
                "<br/>" +
                "<label for= 'FirstChoice'>My Favorite Language:</label>" +
                "<br/>" +
                "<select name='FirstChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='C#'>C#</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br/>" +
                "<label for= 'SecondChoice'>My Second Favorite Language:</label>" +
                "<br/>" +
                "<select name='SecondChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='C#'>C#</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br/>" +
                "<label for= 'ThirdChoice'>My Third Favorite Language:</label>" +
                "<br/>" +
                "<select name='ThirdChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='C#'>C#</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br/>" +
                "<input type='submit' value='submit'>" +
                "</form>";

    }
    @PostMapping("form")
    @ResponseBody
    public String inputForm(@RequestParam String name,
                            @RequestParam String FirstChoice,
                            @RequestParam String SecondChoice,
                            @RequestParam String ThirdChoice) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + FirstChoice + "</li>" +
                "<li>" + SecondChoice + "</li>" +
                "<li>" + ThirdChoice + "</li>" +
                "</ol>";
    }
}

package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String skillsTracker(){
        String html = "<html>" +
                "<head><title>Skills Tracker</title></head>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<p>We have a few skills we would like you to learn. Here is the list!</p>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;

    }

    @GetMapping("/form")
    @ResponseBody
    public String skillsForm(@RequestParam String name, String java, String javascript, String python){
        String html = "<html>" +
                "<head><title>Skills Tracker Form</title></head>" +
                "<body>" +
                "<label='text'>Name:</label><br>" +
                "<form action='/form' method='post'>" +
                "<input type= 'text' name= 'name'><br>" +
                "<label='language1'>My Favorite language:</label><br>" +
                "<select name='language1' id='language1'><br>" +
                "<option value='java'>Java</option>" +
                 "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br><label='language2'>My Second Favorite language:</label><br>" +
                "<select name='language2' id='language2'><br>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br><label='language3'>My Third Favorite language:</label><br>" +
                "<select name='language3' id='language3'><br>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br><input type= 'submit' value= 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
        return html;
    }
    @RequestMapping(value="/form", method = RequestMethod.POST)
    @ResponseBody
    public String resultsForm(@RequestParam String name, String language1, String language2, String language3) {

    }


}

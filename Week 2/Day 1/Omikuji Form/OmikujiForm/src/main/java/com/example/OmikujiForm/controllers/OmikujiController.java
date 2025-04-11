package com.example.OmikujiForm.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {

    @RequestMapping("/omikuji")
    public String index() {
        return "omikuji";
    }

    @RequestMapping(value = "/process", method = RequestMethod.POST)
    public String processForm(
            @RequestParam("number") int number,
            @RequestParam("city") String city,
            @RequestParam("person") String person,
            @RequestParam("endeavor") String endeavor,
            @RequestParam("livingThing") String livingThing,
            @RequestParam("message") String message,
            HttpSession session) {
        // Store form data in session
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("endeavor", endeavor);
        session.setAttribute("livingThing", livingThing);
        session.setAttribute("message", message);
        return "redirect:/omikuji/show";
    }

    @RequestMapping("/omikuji/show")
    public String showFortune() {
        return "show";
    }
}
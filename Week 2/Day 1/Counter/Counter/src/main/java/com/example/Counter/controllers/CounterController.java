package com.example.Counter.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CounterController {

    @RequestMapping("/")
    public String index(HttpSession session) {
        // Initialize counter if it doesn't exist
        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        }
        // Increment counter by 1
        Integer count = (Integer) session.getAttribute("count");
        session.setAttribute("count", count + 1);
        return "index";
    }

    @RequestMapping("/counter")
    public String counter(HttpSession session, Model model) {
        // If counter doesn't exist, set to 0
        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        }
        // Pass counter to JSP
        model.addAttribute("count", session.getAttribute("count"));
        return "counter";
    }

    // Ninja Bonus 1: Increment by 2
    @RequestMapping("/increment-by-two")
    public String incrementByTwo(HttpSession session) {
        // Initialize counter if it doesn't exist
        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        }
        // Increment counter by 2
        Integer count = (Integer) session.getAttribute("count");
        session.setAttribute("count", count + 2);
        return "incrementByTwo";
    }

    // Ninja Bonus 2: Reset counter
    @RequestMapping(value = "/reset", method = RequestMethod.POST)
    public String reset(HttpSession session) {
        session.setAttribute("count", 0);
        return "redirect:/counter";
    }
}
package com.example.DisplayDate.controllers;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateTimeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/date")
    public String date(Model model) {
        model.addAttribute("date", new Date());
        return "date";
    }

    @RequestMapping("/time")
    public String time(Model model) {
        model.addAttribute("time", new Date());
        return "time";
    }
}
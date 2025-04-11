package com.example.NinjaGoldGames.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;

@Controller
public class GameController {

    @RequestMapping("/")
    public String index(HttpSession session) {
        if (session.getAttribute("gold") == null) {
            session.setAttribute("gold", 0);
            session.setAttribute("activities", new ArrayList<String>());
        }
        return "index";
    }

    @RequestMapping(value = "/process", method = RequestMethod.POST)
    public String process(
            @RequestParam("location") String location,
            HttpSession session) {
        Random random = new Random();
        int goldChange = 0;
        String activityMessage = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy h:mm a");

        Integer gold = (Integer) session.getAttribute("gold");
        @SuppressWarnings("unchecked")
        ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");

        switch (location) {
            case "farm":
                goldChange = random.nextInt(11) + 10; 
                break;
            case "cave":
                goldChange = random.nextInt(6) + 5; 
                break;
            case "house":
                goldChange = random.nextInt(4) + 2;
                break;
            case "quest":
                goldChange = random.nextInt(101) - 50; 
                break;
            case "spa":
                goldChange = -(random.nextInt(16) + 5); 
                break;
        }

        gold += goldChange;
        session.setAttribute("gold", gold);

        if (goldChange >= 0) {
            activityMessage = String.format("You entered a %s and earned %d gold. (%s)",
                    location, goldChange, dateFormat.format(new Date()));
        } else {
            activityMessage = String.format("You entered a %s and lost %d gold. Ouch! (%s)",
                    location, -goldChange, dateFormat.format(new Date()));
        }

        activities.add(0, activityMessage);
        session.setAttribute("activities", activities);

        if (gold < -100) {
            return "redirect:/prison";
        }

        return "redirect:/";
    }

    @RequestMapping(value = "/reset", method = RequestMethod.POST)
    public String reset(HttpSession session) {
        // Reset gold and activities
        session.setAttribute("gold", 0);
        session.setAttribute("activities", new ArrayList<String>());
        return "redirect:/";
    }

    @RequestMapping("/prison")
    public String prison() {
        return "prison";
    }
}
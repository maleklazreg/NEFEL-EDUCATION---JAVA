package com.example.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String greet(
            @RequestParam(value = "name", required = false, defaultValue = "human") String name,
            @RequestParam(value = "last_name", required = false) String lastName,
            @RequestParam(value = "times", required = false, defaultValue = "1") int times) {
        
        String greeting = "Hello " + name;
        if (lastName != null) {
            greeting += " " + lastName;
        }

        StringBuilder repeatedGreeting = new StringBuilder();
        for (int i = 0; i < times; i++) {
            repeatedGreeting.append(greeting);
            if (i < times - 1) {
                repeatedGreeting.append("\n"); 
            }
        }

        return repeatedGreeting.toString();
    }
}
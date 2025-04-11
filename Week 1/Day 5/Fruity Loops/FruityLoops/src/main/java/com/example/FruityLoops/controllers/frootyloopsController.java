package com.example.FruityLoops.controllers;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.FruityLoops.models.fruityloopsModel;

@Controller
public class frootyloopsController {

    @RequestMapping("/")
    public String index(Model model) {
        
        ArrayList<fruityloopsModel> fruits = new ArrayList<fruityloopsModel>();
        fruits.add(new fruityloopsModel("Kiwi", 1.5));
        fruits.add(new fruityloopsModel("Mango", 2.0));
        fruits.add(new fruityloopsModel("Goji Berries", 4.0));
        fruits.add(new fruityloopsModel("Guava", 0.75));
        
        // Add fruits to the view model
        model.addAttribute("fruits", fruits);
        
        return "index";
    }
}
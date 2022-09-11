package com.example.EcoMonitoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CityController {

    @GetMapping("/home")
    public String greeting(Model model) {
        model.addAttribute("title", "Ох стрьомно це все"); //розумію
        return "home";
    }

}

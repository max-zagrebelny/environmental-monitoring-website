package com.example.EcoMonitoring.controller;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.Element;
import com.example.EcoMonitoring.model.ElementFactory;
import com.example.EcoMonitoring.model.Factory;
import com.example.EcoMonitoring.service.CityService;
import com.example.EcoMonitoring.service.ElementFactoryService;
import com.example.EcoMonitoring.service.ElementService;
import com.example.EcoMonitoring.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CityController {


    @Autowired
    private final CityService cityService;

    @Autowired
    private final ElementFactoryService elementFactoryService;

    @Autowired
    private final  ElementService elementService;

    @Autowired
    private final FactoryService factoryService;

    public CityController(CityService cityService, ElementFactoryService elementFactoryService, ElementService elementService, FactoryService factoryService) {
        this.cityService = cityService;
        this.elementFactoryService = elementFactoryService;
        this.elementService = elementService;
        this.factoryService = factoryService;
    }


    @GetMapping("/home")
    public String home(Model model) {

        City city = new City();
        String cityName = "Черкаси";


        try {
            city = cityService.findByName(cityName);
        } catch (NullPointerException e) {
           model.addAttribute("city", cityName);
           return "error";
        }
        cityService.delete(city);
        cityService.save(city);
        model.addAttribute("city", city);

        return "home";
    }
}

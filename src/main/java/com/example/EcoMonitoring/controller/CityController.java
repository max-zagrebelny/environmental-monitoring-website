package com.example.EcoMonitoring.controller;

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
    private CityService cityService;

    @Autowired
    private ElementFactoryService elementFactoryService;

    @Autowired
    private ElementService elementService;

    @Autowired
    private FactoryService factoryService;

    public CityController(CityService cityService, ElementFactoryService elementFactoryService, ElementService elementService, FactoryService factoryService) {
        this.cityService = cityService;
        this.elementFactoryService = elementFactoryService;
        this.elementService = elementService;
        this.factoryService = factoryService;
    }



    @GetMapping("/home")
    public String home(Model model) {


        Element element1 = elementService.findByNameElement("Калій");
        Element element2 = elementService.findByNameElement("Силіцій");
        List<Element> elements = new ArrayList<>();
        elements.add(element1);
        elements.add(element2);
        model.addAttribute("elem", elements);
        System.out.println(element2.getNameElement());
        System.out.println(element2.getNameElement());
        return "home";

    }

}

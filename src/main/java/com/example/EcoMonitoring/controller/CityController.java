package com.example.EcoMonitoring.controller;

import com.example.EcoMonitoring.model.Element;
import com.example.EcoMonitoring.model.Factory;
import com.example.EcoMonitoring.service.CityService;
import com.example.EcoMonitoring.service.ElementFactoryService;
import com.example.EcoMonitoring.service.ElementService;
import com.example.EcoMonitoring.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


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

        Factory factory = factoryService.findAll().get(0);
        System.out.println(factory.getName());
        Element element1 = elementService.findByNameElement("калій");
        System.out.println(element1.getNameElement());
        return "home";
    }

}

package com.example.EcoMonitoring.controller;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.Element;
import com.example.EcoMonitoring.model.ElementCity;
import com.example.EcoMonitoring.service.CityService;
import com.example.EcoMonitoring.service.ElementCityService;
import com.example.EcoMonitoring.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CityController {


    @Autowired
    private CityService cityService;

    @Autowired
    private ElementCityService elementCityService;

    @Autowired
    private ElementService elementService;

    public CityController(CityService cityService, ElementCityService elementCityService, ElementService elementService) {
        this.cityService = cityService;
        this.elementCityService = elementCityService;
        this.elementService = elementService;
    }



    @GetMapping("/home")
    public String home(Model model) {

        //City city = cityService.findByName("Черкаси");
        //ElementCity elementCity = new ElementCity();
        //elementCity.setCity(city);
        //city.setElements(elementCityService.findAll());
        Element element1 = elementService.findByNameElement("калій");
        System.out.println(element1.getNameElement());
        return "home";
    }

}

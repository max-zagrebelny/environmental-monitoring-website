package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.Element;
import com.example.EcoMonitoring.model.ElementFactory;
import com.example.EcoMonitoring.model.Factory;
import com.example.EcoMonitoring.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImp implements CityService {

    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private ElementFactoryService elementFactoryService;
    @Autowired
    private FactoryService factoryService;
    @Autowired ElementService elementService;

    public CityServiceImp(CityRepository cityRepository, ElementFactoryService elementFactoryService,
                          FactoryService factoryService, ElementService elementService) {
        this.cityRepository = cityRepository;
        this.elementFactoryService = elementFactoryService;
        this.factoryService = factoryService;
        this.elementService = elementService;
    }


    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public void delete(City city) {
        cityRepository.delete(city);
    }

    @Override
    public void save(City city) {
        cityRepository.save(city);
    }

    @Override
    public City findByName(String name) {

        City city = cityRepository.findByName(name);

        for(Factory factory: city.getFactories()) {
            for(ElementFactory elementFactory: factory.getElements()) {

                Element element = elementService.findByCode(elementFactory.getCode());

                elementFactory.setAverageDaily(element.getAverageDaily());
                elementFactory.setMaxOnce(element.getMaxOnce());

                if(elementFactory.getValue() > element.getMaxOnce()) {
                    elementFactory.setExcess(true);
                }
            }
        }
        return city;
    }
}
package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.ElementCity;
import com.example.EcoMonitoring.service.CityService;
import com.example.EcoMonitoring.repository.CityRepository;
import com.example.EcoMonitoring.repository.ElementCityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImp implements CityService {

    @Autowired
    CityRepository cityRepository;


    @Override
    public City findOne(int intId) {
        return cityRepository.getById(intId);
    }

}

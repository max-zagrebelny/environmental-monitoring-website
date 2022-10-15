package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.Element;
import com.example.EcoMonitoring.model.EnvironmentalTax;
import com.example.EcoMonitoring.utils.FactoryTaxes;

import java.util.HashMap;
import java.util.List;

public interface EnvironmentalTaxService {

    EnvironmentalTax findByNameAndType(String nameElement, String type, City city);
    List<EnvironmentalTax> findByType(String type);

    public List<FactoryTaxes> calculateTax(City city, Boolean atmos, Boolean aquas, Boolean alloc, Boolean radios, Boolean radiosAlloc);


}

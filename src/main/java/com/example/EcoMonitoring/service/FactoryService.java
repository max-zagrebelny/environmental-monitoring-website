package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.Element;
import com.example.EcoMonitoring.model.Factory;

import java.util.List;


public interface FactoryService {
    List<Factory> findAll();
    void saveFactory( Factory factory);
}

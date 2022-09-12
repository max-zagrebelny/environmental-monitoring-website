package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.ElementFactory;

import java.util.List;

public interface ElementFactoryService {
    List<ElementFactory> findAll();
    ElementFactory findByNameElement(String nameElement);
}

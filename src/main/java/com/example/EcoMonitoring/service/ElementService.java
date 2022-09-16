package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.Element;

import java.util.List;

public interface ElementService {
    List<Element> findAll();
    void saveElement(Element element);
    Element findByNameElement(String nameElement);
    Element findByCode(int code);
}

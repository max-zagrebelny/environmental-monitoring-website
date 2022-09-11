package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.Element;

import java.util.List;

public interface ElementService {
    List<Element> findAll();
    Element findOne(String name);
}

package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.Element;
import com.example.EcoMonitoring.repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementServiseImp implements ElementService{

    @Autowired
    ElementRepository elementRepository;

    @Override
    public List<Element> findAll() {
        return elementRepository.findAll();
    }

    @Override
    public Element findOne(String name) {
        return elementRepository.findByNameElement(name);
    }

}

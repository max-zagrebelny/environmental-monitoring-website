package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.ElementFactory;
import com.example.EcoMonitoring.repository.ElementFactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementFactoryServiceImp implements ElementFactoryService {

    @Autowired
    private ElementFactoryRepository elementFactoryRepository;

    public ElementFactoryServiceImp(ElementFactoryRepository elementFactoryRepository) {
        this.elementFactoryRepository = elementFactoryRepository;
    }

    @Override
    public List<ElementFactory> findAll() {
        return elementFactoryRepository.findAll();
    }

    @Override
    public ElementFactory findByNameElement(String nameElement) {
        return elementFactoryRepository.findByNameElement(nameElement);
    }


}

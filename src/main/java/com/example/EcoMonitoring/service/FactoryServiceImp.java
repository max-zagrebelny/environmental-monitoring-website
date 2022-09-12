package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.Factory;
import com.example.EcoMonitoring.repository.FactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactoryServiceImp implements FactoryService{

    @Autowired
    private FactoryRepository factoryRepository;

    @Override
    public List<Factory> findAll() {
        return factoryRepository.findAll();
    }

    @Override
    public void saveFactory(Factory factory) {
        factoryRepository.save(factory);
    }
}

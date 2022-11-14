package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.Element;
import com.example.EcoMonitoring.repository.ElementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElementServiceImp implements ElementService{

    private final ElementRepository elementRepository;

    public ElementServiceImp(ElementRepository elementRepository) {
        this.elementRepository = elementRepository;
    }

    @Override
    public List<Element> findAll() {
        return elementRepository.findAll();
    }

    @Override
    public Element findByNameElement(String nameElement)
    {
        return elementRepository.findByNameElement(nameElement);
    }

    public Optional<Element> findByCode(Long id) {
        return elementRepository.findById(id);
    }

    @Override
    public void saveElement(Element element) {
        elementRepository.save(element);
    }
}

package com.example.EcoMonitoring.repository;


import com.example.EcoMonitoring.model.ElementFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementFactoryRepository extends JpaRepository<ElementFactory, Integer> {
    ElementFactory findByNameElement(String nameElement);
}
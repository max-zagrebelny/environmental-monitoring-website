package com.example.EcoMonitoring.repository;


import com.example.EcoMonitoring.model.ElementFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElementFactoryRepository extends JpaRepository<ElementFactory, Long> {

    ElementFactory findByNameElement(String nameElement);

}
package com.example.EcoMonitoring.utils;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompensationDamage {

    private String nameFactory;
    private String nameElement;
    private Double compensationDamage;

    public CompensationDamage(String nameFactory, String nameElement, Double compensationDamage) {
        this.nameFactory = nameFactory;
        this.nameElement = nameElement;
        this.compensationDamage = compensationDamage;
    }
}

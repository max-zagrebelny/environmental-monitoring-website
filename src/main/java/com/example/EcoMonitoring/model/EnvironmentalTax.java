package com.example.EcoMonitoring.model;

import javax.persistence.*;


@Entity
@Table(name = "environmental_tax")
public class EnvironmentalTax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="type_elements")
    private String  type;
    private String nameElement;
    private Double taxRates;

    private Double concentration;

    private Integer hazardClass;

    private String allocation;

    public EnvironmentalTax() {}

    public EnvironmentalTax(Long id, String type, String nameElement, Double taxRates, Double concentration, Integer hazardClass, String allocation ) {
        this.id = id;
        this.type = type;
        this.nameElement = nameElement;
        this.taxRates = taxRates;
        this.concentration = concentration;
        this.hazardClass = hazardClass;
        this.allocation = allocation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameElement() {
        return nameElement;
    }

    public void setNameElement(String nameElement) {
        this.nameElement = nameElement;
    }

    public Double getTaxRates() {
        return taxRates;
    }

    public void setTaxRates(Double taxRates) {
        this.taxRates = taxRates;
    }

    public Double getConcentration() {
        return concentration;
    }

    public void setConcentration(Double concentration) {
        this.concentration = concentration;
    }

    public Integer getHazardClass() {
        return hazardClass;
    }

    public void setHazardClass(Integer hazardClass) {
        this.hazardClass = hazardClass;
    }

    public String getAllocation() {
        return allocation;
    }

    public void setAllocation(String allocation) {
        this.allocation = allocation;
    }
}


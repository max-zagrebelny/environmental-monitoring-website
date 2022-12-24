package com.example.EcoMonitoring.model;

import javax.persistence.*;

@Entity
public class AnimalLoss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amountDamages;
    private Double totalWeight;

    @OneToOne(mappedBy = "animal")
    private Factory Factory;

    public AnimalLoss() {}

    public AnimalLoss(Long id, Double amountDamages, Double totalWeight, com.example.EcoMonitoring.model.Factory factory) {
        this.id = id;
        this.amountDamages = amountDamages;
        this.totalWeight = totalWeight;
        Factory = factory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmountDamages() {
        return amountDamages;
    }

    public void setAmountDamages(Double amountDamages) {
        this.amountDamages = amountDamages;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public com.example.EcoMonitoring.model.Factory getFactory() {
        return Factory;
    }

    public void setFactory(com.example.EcoMonitoring.model.Factory factory) {
        Factory = factory;
    }
}

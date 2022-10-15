package com.example.EcoMonitoring.utils;

public class FactoryTaxes {
    private String nameFactory;
    private String nameElement;
    private Double volumeEmissions;
    private Double taxRates;
    private Double TaxAmount;

    public FactoryTaxes(String nameFactory, String nameElement, Double volumeEmissions, Double taxRates, Double taxAmount) {
        this.nameFactory = nameFactory;
        this.nameElement = nameElement;
        this.volumeEmissions = volumeEmissions;
        this.taxRates = taxRates;
        TaxAmount = taxAmount;
    }

    public String getNameFactory() {
        return nameFactory;
    }

    public void setNameFactory(String nameFactory) {
        this.nameFactory = nameFactory;
    }

    public String getNameElement() {
        return nameElement;
    }

    public void setNameElement(String nameElement) {
        this.nameElement = nameElement;
    }

    public Double getVolumeEmissions() {
        return volumeEmissions;
    }

    public void setVolumeEmissions(Double volumeEmissions) {
        this.volumeEmissions = volumeEmissions;
    }

    public Double getTaxRates() {
        return taxRates;
    }

    public void setTaxRates(Double taxRates) {
        this.taxRates = taxRates;
    }

    public Double getTaxAmount() {
        return TaxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        TaxAmount = taxAmount;
    }
}

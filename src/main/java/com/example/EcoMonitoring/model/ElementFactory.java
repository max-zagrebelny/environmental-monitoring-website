package com.example.EcoMonitoring.model;

import javax.persistence.*;

@Entity
@Table(name = "element_factory")
public class ElementFactory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isExcess;
    private double valueElement;
    private double totalEmissions;
    private String nameElement;
    private String message;
    private int percentage;
    private int codeTax;


    @OneToOne
    @JoinColumn(name = "element_id")
    private Element element;
    public double getValueElement() {
        return valueElement;
    }

    public void setValueElement(double valueElement) {
        this.valueElement = valueElement;
    }


    @ManyToOne
    @JoinColumn(name = "factory_id")
    private Factory factory;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nuclear_isd", referencedColumnName = "id")
    private Nuclear nuclear;

    @OneToOne
    @JoinColumn(name = "concentration_id", referencedColumnName = "id")
    private Concentration concentration;



    public ElementFactory() {

    }

    public ElementFactory(float value, boolean isExcess, String nameElement,
                          String message, double totalEmissions, int codeTax, Element element) {
        this.valueElement = value;
        this.isExcess = isExcess;
        this.nameElement = nameElement;
        this.message = message;
        this.totalEmissions = totalEmissions;
        this.codeTax = codeTax;
        this.element = element;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getPercentage() {
        return percentage;
    }
    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public void setValue(double value) {
        this.valueElement = value;
    }

    public double getValue() {
        return this.valueElement;
    }

    public void setExcess(boolean excess) {
        isExcess = excess;
    }

    public boolean isExcess() {
        return isExcess;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameElement() {
        return nameElement;
    }

    public void setNameElement(String name) {
        this.nameElement = nameElement;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getTotalEmissions() {
        return totalEmissions;
    }

    public void setTotalEmissions(double totalEmissions) {
        this.totalEmissions = totalEmissions;
    }

    public int getCodeTax() {
        return codeTax;
    }

    public void setCodeTax(int codeTax) {
        this.codeTax = codeTax;
    }

    public Nuclear getNuclear() {
        return nuclear;
    }

    public void setNuclear(Nuclear nuclear) {
        this.nuclear = nuclear;
    }

    public Concentration getConcentration() {
        return concentration;
    }

    public void setConcentration(Concentration concentration) {
        this.concentration = concentration;
    }
}

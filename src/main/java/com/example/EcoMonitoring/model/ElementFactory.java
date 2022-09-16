package com.example.EcoMonitoring.model;

import javax.persistence.*;

@Entity
@Table(name = "element_factory")
public class ElementFactory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_excess")
    private boolean isExcess;

    @Column(name = "value_element")
    private double valueElement;

    @Column (name = "code_element")
    private int code;

    @Column (name = "name_element")
    private String nameElement;

    @Column (name = "average_daily")
    private double averageDaily;

    @Column (name = "max_once")
    private double maxOnce;

    @Column (name = "hazard_class")
    private int hazardClass;

    @Column(name = "message")
    private String message;

    @ManyToOne
    @JoinColumn(name = "factory_id")
    private Factory factory;

    public ElementFactory() {}

    public ElementFactory(float value, boolean isExcess,String nameElement,
                          float averageDaily, float maxOnce, int hazardClass, int code, String message) {
        this.valueElement = value;
        this.isExcess = isExcess;
        this.nameElement = nameElement;
        this.averageDaily = averageDaily;
        this.maxOnce = maxOnce;
        this.hazardClass = hazardClass;
        this.code = code;
        this.message = message;
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
        return valueElement;
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

    public int getHazardClass() {
        return hazardClass;
    }

    public void setHazardClass(int hazardClass) {
        this.hazardClass = hazardClass;
    }

    public void setAverageDaily(double averageDaily) {
        this.averageDaily = averageDaily;
    }

    public double getAverageDaily() {
        return averageDaily;
    }

    public void setMaxOnce(double maxOnce) {
        this.maxOnce = maxOnce;
    }

    public double getMaxOnce() {
        return maxOnce;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

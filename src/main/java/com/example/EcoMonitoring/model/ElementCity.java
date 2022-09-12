package com.example.EcoMonitoring.model;

import javax.persistence.*;

@Entity
@Table(name = "element_city")
public class ElementCity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_excess")
    private boolean isExcess;

    @Column(name = "value_element")
    private float valueElement;

    @Column (name = "code_element")
    private int code;

    @Column (name = "name_element")
    private String nameElement;

    @Column (name = "average_daily")
    private float averageDaily;

    @Column (name = "max_once")
    private float maxOnce;

    @Column (name = "hazard_class")
    private int hazardClass;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public ElementCity() {}

    public ElementCity(float value, boolean isExcess, String nameElement, float averageDaily, float maxOnce, int hazardClass, int code) {
        this.valueElement = value;
        this.isExcess = isExcess;
        this.nameElement = nameElement;
        this.averageDaily = averageDaily;
        this.maxOnce = maxOnce;
        this.hazardClass = hazardClass;
        this.code = code;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setValue(float value) {
        this.valueElement = value;
    }

    public float getValue() {
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

    public void setAverageDaily(float averageDaily) {
        this.averageDaily = averageDaily;
    }

    public float getAverageDaily() {
        return averageDaily;
    }

    public void setMaxOnce(float maxOnce) {
        this.maxOnce = maxOnce;
    }

    public float getMaxOnce() {
        return maxOnce;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

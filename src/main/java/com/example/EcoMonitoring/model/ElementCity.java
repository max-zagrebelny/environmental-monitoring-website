package com.example.EcoMonitoring.model;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "element_city")
public class ElementCity extends Element {

    @Column(name = "is_excess")
    private boolean isExcess;

    @Column(name = "value_element")
    private float valueElement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;

    public ElementCity() {}

    public ElementCity(float value, boolean isExcess) {
        this.valueElement = value;
        this.isExcess = isExcess;
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
}

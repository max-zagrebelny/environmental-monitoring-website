package com.example.EcoMonitoring.model;

import javax.persistence.*;
import java.util.HashMap;


@Entity // This tells Hibernate to make a table out of this class
@Table(name = "elements")
public class Element {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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



    public Element() {
    }

    public Element(String nameElement, float averageDaily, float maxOnce, int hazardClass, int code) {
        this.nameElement = nameElement;
        this.averageDaily = averageDaily;
        this.maxOnce = maxOnce;
        this.hazardClass = hazardClass;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

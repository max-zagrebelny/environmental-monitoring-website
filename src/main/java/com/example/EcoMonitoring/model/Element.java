package com.example.EcoMonitoring.model;

import javax.persistence.*;


@Entity
@Table(name = "elements")
public class Element {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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



    public Element() {
    }

    public Element(String nameElement, double averageDaily, double maxOnce, int hazardClass, int code) {
        this.nameElement = nameElement;
        this.averageDaily = averageDaily;
        this.maxOnce = maxOnce;
        this.hazardClass = hazardClass;
        this.code = code;
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

    @Override
    public String toString() {
        return "Element{" +
                "id=" + id +
                ", code=" + code +
                ", nameElement='" + nameElement + '\'' +
                ", averageDaily=" + averageDaily +
                ", maxOnce=" + maxOnce +
                ", hazardClass=" + hazardClass +
                '}';
    }
}

package com.example.EcoMonitoring.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "elements")
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    @Column (name = "name_element")
    private String nameElement;

    @Column (name = "average_daily")
    private double averageDaily;

    @Column (name = "max_once")
    private double maxOnce;

    @Column (name = "hazard_class")
    private int hazardClass;

    @OneToMany(mappedBy = "element", cascade = CascadeType.ALL)
    private List<ElementFactory> elementFactory;

    public Element() {
    }

    public Element(String nameElement, double averageDaily, double maxOnce, int hazardClass, Long code, ElementFactory elementFactory) {
        this.nameElement = nameElement;
        this.averageDaily = averageDaily;
        this.maxOnce = maxOnce;
        this.hazardClass = hazardClass;
        this.code = code;
        this.elementFactory = new ArrayList<>();
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

    public void setId(Long code) {
        this.code = code;
    }

    public Long getId() {
        return code;
    }

    public List<ElementFactory> getElementFactory() {
        return elementFactory;
    }

    public void setElementFactory(List<ElementFactory> elementFactory) {
        this.elementFactory = elementFactory;
    }

    @Override
    public String toString() {
        return "Element{" +
                ", id =" + code +
                ", nameElement='" + nameElement + '\'' +
                ", averageDaily=" + averageDaily +
                ", maxOnce=" + maxOnce +
                ", hazardClass=" + hazardClass +
                '}';
    }
}

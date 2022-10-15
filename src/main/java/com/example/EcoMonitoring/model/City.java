package com.example.EcoMonitoring.model;
import javax.persistence.*;

import java.sql.Date;
import java.time.Year;
import java.util.List;


@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_city")
    private String name;
    @Column(name="city_year")
    private Integer year;
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factory> factories;

    public City() {
    }

    public City(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Factory> getFactories() {
        return factories;
    }

    public void setFactories(List<Factory> factories) {
        this.factories = factories;
    }

    public void addFactory(Factory factory) {
        factory.setCity(this);
        factories.add(factory);
    }

    public void removeFactory(Factory factory) {
        factories.remove(factory);
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
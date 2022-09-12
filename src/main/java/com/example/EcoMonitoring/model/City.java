package com.example.EcoMonitoring.model;



import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "city")
public class City {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_city")
    private String name;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factory> factories;

    public City() {
    }

    public City(String name) {
        this.name = name;
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

}
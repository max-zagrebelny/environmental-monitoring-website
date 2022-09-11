package com.example.EcoMonitoring.model;



import javax.lang.model.element.Element;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity // This tells Hibernate to make a table out of this class
@Table(name = "city")
public class City {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ElementCity> elements;

    public City() {
    }

    public City(String name) {
        this.name = name;
        elements = new ArrayList<>();
    }

    public void addElement(ElementCity element) {
        element.setCity(this);
        elements.add(element);
    }

    public void removeElement(ElementCity element) {
        elements.remove(element);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ElementCity> getElements() {
        return elements;
    }

    public void setElements(List<ElementCity> elements) {
        this.elements = elements;
    }
}
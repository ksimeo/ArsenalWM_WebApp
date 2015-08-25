package com.ksimeo.arsu.view.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Map;

/**
 * @author Ksimeo 25.08.2015.
 */
@Entity(name = "buckets")
public class Basket {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String number;
    @Column
    private Map<Product, Long> order;

    public Basket() { }

    public Basket(int id, String name, String number, Map<Product, Long> order) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Map<Product, Long> getOrder() {
        return order;
    }

    public void setOrder(Map<Product, Long> order) {
        this.order = order;
    }
}
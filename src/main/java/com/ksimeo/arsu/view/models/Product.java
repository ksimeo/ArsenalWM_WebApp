package com.ksimeo.arsu.view.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Ksimeo 18.08.2015.
 */
@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private ProdType prodType;
    @Column
    private String producer;
    @Column
    private String model;
    @Column
    private String description;
    @Column
    private String country;
    @Column
    private double price;
    @Column
    private CurrencyType currType;
    @Column
    private UnitsType units;

    public Product() { }

    public Product(String producer, String model, String description, String type, String country, double price,
                   CurrencyType currType, UnitsType units) {
        this.producer = producer;
        this.model = model;
        this.description = description;
        this.country = country;
        this.price = price;
        this.currType = currType;
        this.units = units;
    }

    public Product(int id, String producer, String model, String description, String country, double price,
                   CurrencyType currType, UnitsType units) {
        this.id = id;
        this.producer = producer;
        this.model = model;
        this.description = description;
        this.country = country;
        this.price = price;
        this.currType = currType;
        this.units = units;
    }

    public Product(ProdType prodType, String producer, String model, String description, String country, double price,
                   CurrencyType currType, UnitsType units) {
        this.prodType = prodType;
        this.producer = producer;
        this.model = model;
        this.description = description;
        this.country = country;
        this.price = price;
        this.currType = currType;
        this.units = units;
    }

    public int getId() {
        return id;
    }

    public ProdType getProdType() {
        return prodType;
    }

    public void setProdType(ProdType prodType) {
        this.prodType = prodType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CurrencyType getCurrType() {
        return currType;
    }

    public void setCurrType(CurrencyType currType) {
        this.currType = currType;
    }
    public UnitsType getUnits() {
        return units;
    }

    public void setUnits(UnitsType units) {
        this.units = units;
    }
}

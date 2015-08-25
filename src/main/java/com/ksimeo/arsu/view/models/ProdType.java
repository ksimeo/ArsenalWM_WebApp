package com.ksimeo.arsu.view.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * @author Ksimeo 18.08.2015.
 */
@Entity(name = "types")
public class ProdType {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private ProdGroup prodGroup;
    @Column
    private String name;
    @Column
    private List<Product> products;

    public ProdType() { }

    public ProdType(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public ProdType(int id, String name, List<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public ProdType(ProdGroup prodGroup, String name, List<Product> products) {
        this.prodGroup = prodGroup;
        this.name = name;
        this.products = products;
    }

    public ProdGroup getProdGroup() {
        return prodGroup;
    }

    public void setProdGroup(ProdGroup prodGroup) {
        this.prodGroup = prodGroup;
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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(int id) {
        for (Product product : products) {
            if(id == product.getId())
                return product;
        }
        return null;
    }
}
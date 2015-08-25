package com.ksimeo.arsu.view.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * @author Ksimeo 15.08.2015.
 */
@Entity(name = "groups")
public class ProdGroup {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private List<ProdType> types;

    public ProdGroup() { }

    public ProdGroup(int id, String name, List<ProdType> types) {
        this.id = id;
        this.name = name;
        this.types = types;
    }

    public ProdGroup(int id, String name) {
        this.id = id;
        this.name = name;
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

    public List<ProdType> getTypes() {
        return types;
    }

    public void setTypes(List<ProdType> types) {
        this.types = types;
    }

    public ProdType getType(int id) {
        for(ProdType type : types) {
            if(type.getId() == id)
                return type;
        }
        return null;
    }
}
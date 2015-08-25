package com.ksimeo.arsu.view.server;

import com.ksimeo.arsu.view.models.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ksimeo 18.08.2015.
 */
public class RestServerMock implements IRestServer {
    private List<ProdGroup> groups;
    private List<ProdType> types;
    private List<Product> products;
    private Product product;

    public RestServerMock() {
        groups = new ArrayList<ProdGroup>();
        ProdGroup prodGroup = new ProdGroup(1, "Крупная бытовая техника", types);
        groups.add(prodGroup);
        groups.add(new ProdGroup(2, "Кухонная техника", types));
        groups.add(new ProdGroup(3, "Электроника", types));
        groups.add(new ProdGroup(4, "Самовары", types));
        groups.add(new ProdGroup(5, "Компьютеры", types));
        groups.add(new ProdGroup(6, "Ковры", types));
        types = new ArrayList<ProdType>();
        ProdType prodType = new ProdType(prodGroup, "Мультиварки", products);
        types.add(prodType);
        types.add(new ProdType(prodGroup, "Кофеварки", products));
        types.add(new ProdType(prodGroup, "Электрочайники", products));
        types.add(new ProdType(prodGroup, "Микроволновки", products));
        products = new ArrayList<Product>();
        product = new Product(1, "PHILIPS", "GC4914/20", "Утюг паровой", "Польша", 3.99, CurrencyType.UAH, UnitsType.PIECE);
        products.add(product);
        products.add(new Product(2, "SUPRA", "12314", "Пылесос", "Болгария", 234.50, CurrencyType.USD, UnitsType.PIECE));
        products.add(new Product(3, "Rowenta", "fdssdf", "Чайник", "Швеция", 345.50, CurrencyType.UAH, UnitsType.PIECE));
    }

    public ProdGroup getGroup(int id) {
        for (ProdGroup group : groups) {
            if(id == group.getId())
                return group;
        }
        return null;
    }

    public List<ProdGroup> getAllGroups() {
        return groups;
    }

    public List<ProdType> getTypes(int id) {
        return types;
    }

    public List<Product> getProducts(int id) {
        return products;
    }

    public Product getProd(int groupId, int prodId, int id) {
        return product;
    }
}
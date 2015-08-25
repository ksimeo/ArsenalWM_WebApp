package com.ksimeo.arsu.view.server;

import com.ksimeo.arsu.view.models.ProdGroup;
import com.ksimeo.arsu.view.models.ProdType;
import com.ksimeo.arsu.view.models.Product;

import java.util.List;

/**
 * @author Ksimeo 18.08.2015.
 */
public interface IRestServer {

    List<ProdType> getTypes(int id);
    List<ProdGroup> getAllGroups();
    ProdGroup getGroup(int id);
    List<Product> getProducts(int id);
    Product getProd(int groupId, int typeId, int prodId);
}
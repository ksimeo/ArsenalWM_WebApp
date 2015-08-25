package com.ksimeo.arsu.view.controllers;

import com.ksimeo.arsu.view.models.Product;
import com.ksimeo.arsu.view.server.IRestServer;
import com.ksimeo.arsu.view.server.RestServerMock;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Ksimeo 22.08.2015.
 */
@WebServlet(urlPatterns = "/product")
public class ProductController extends HttpServlet {
    private IRestServer restServer;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String groupId = req.getParameter("groupid");
            String typeId = req.getParameter("typeid");
            String productId = req.getParameter("id");
            restServer = new RestServerMock();
            Product prod = restServer.getGroup(Integer.parseInt(groupId)).getType(Integer
                    .parseInt(typeId)).getProduct(Integer.parseInt(productId));
            req.setAttribute("group_id", prod.getId());
            req.setAttribute("type_id", prod.getId());
            req.setAttribute("producer", prod.getProducer());
            req.setAttribute("model", prod.getModel());
            req.setAttribute("descr", prod.getDescription());
            req.setAttribute("type", prod.getCurrType());
            req.setAttribute("country", prod.getCountry());
            req.setAttribute("price", prod.getPrice());
            req.getRequestDispatcher("/product.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
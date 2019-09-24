package edu.mum.cs.controller;

import edu.mum.cs.dao.Dao;
import edu.mum.cs.daoImpl.ProductDao;
import edu.mum.cs.model.Advertisement;
import edu.mum.cs.model.Product;
import edu.mum.cs.utility.FBUtility;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product")
public class ProductController extends HttpServlet {
    //Dao productDao = new ProductDao();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Open a EntityManager
        EntityManager em = FBUtility.getEntityManager(req.getServletContext());
        em.getTransaction().begin();
        //
        String name = req.getParameter("productName");
        String desc = req.getParameter("productDes");
        System.out.println(name + " : " + desc);
        Product newProduct = new Product(name,desc);
        System.out.println("Before Adding : "+newProduct);
        em.persist(newProduct);

        // Close the EntityManager
        em.getTransaction().commit();
        em.close();

        System.out.println("New Product added : "+newProduct);
        req.getRequestDispatcher("product/list.jsp").forward(req,resp);
        ///doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("product/list.jsp");
        //doPost(req,resp);
    }
}

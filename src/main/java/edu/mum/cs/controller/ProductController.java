package edu.mum.cs.controller;

import edu.mum.cs.dao.Dao;
import edu.mum.cs.daoImpl.ProductDao;
import edu.mum.cs.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product")
public class ProductController extends HttpServlet {
    Dao productDao = new ProductDao();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("productName");
        String desc = req.getParameter("productDes");
        Product newProduct = new Product();
        newProduct.setName(name);
        newProduct.setDesc(desc);
        productDao.save(newProduct);
        req.getRequestDispatcher("product").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("product/list.jsp");
    }
}

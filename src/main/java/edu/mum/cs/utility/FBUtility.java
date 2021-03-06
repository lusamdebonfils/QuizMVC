package edu.mum.cs.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContext;

public class FBUtility {
    public static EntityManager getEntityManager(ServletContext servletContext) {
        EntityManagerFactory emf = (EntityManagerFactory) servletContext.getAttribute("emFactory");
        EntityManager em = emf.createEntityManager();
        return em;
    }
    public static String getImgPath(ServletContext servletContext) {
        return servletContext.getInitParameter("imgPath");
    }


}

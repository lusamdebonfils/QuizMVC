package edu.mum.cs.daoImpl;

import edu.mum.cs.config.JpaEntityManagerFactory;
import edu.mum.cs.dao.Dao;
import edu.mum.cs.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ProductDao implements Dao<Product> {
    private EntityManager entityManager;

    public ProductDao()
    {
        entityManager =  new JpaEntityManagerFactory(new Class[]{Product.class}).getEntityManager();
    }

    @Override
    public Optional<Product> get(long id) {
        return Optional.ofNullable(entityManager.find(Product.class, id));
    }

    @Override
    public List<Product> getAll() {
        Query query = entityManager.createQuery("SELECT e FROM Product e");
        return query.getResultList();
    }

    @Override
    public void save(Product product) {
        executeInsideTransaction(entityManager -> entityManager.persist(product));
    }

    @Override
    public void update(Product product, String[] params) {
        executeInsideTransaction(entityManager -> entityManager.merge(product));
    }

    @Override
    public void delete(Product product) {
        executeInsideTransaction(entityManager -> entityManager.remove(product));
        entityManager.remove(product);

    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            action.accept(entityManager);
            tx.commit();
        }
        catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }
    }
}

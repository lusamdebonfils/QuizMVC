package edu.mum.cs.daoImpl;

import edu.mum.cs.config.JpaEntityManagerFactory;
import edu.mum.cs.dao.Dao;
import edu.mum.cs.model.Advertisement;
import edu.mum.cs.model.Picture;
import edu.mum.cs.model.Post;
import edu.mum.cs.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class AdvertisementDao implements Dao<Advertisement> {
    private EntityManager entityManager;

    public AdvertisementDao()
    {
        entityManager =  new JpaEntityManagerFactory(
                new Class[]{User.class, Picture.class, Post.class, Advertisement.class}).getEntityManager();
    }



    @Override
    public Optional<Advertisement> get(long id) {
        return Optional.ofNullable(entityManager.find(Advertisement.class, id));
    }

    @Override
    public List<Advertisement> getAll() {
        Query query = entityManager.createQuery("SELECT e FROM Advertisement e");
        return query.getResultList();
    }

    @Override
    public void save(Advertisement advertisement) {
        executeInsideTransaction(entityManager -> entityManager.persist(advertisement));
    }

    @Override
    public void update(Advertisement advertisement, String[] params) {
        executeInsideTransaction(entityManager -> entityManager.merge(advertisement));
    }

    @Override
    public void delete(Advertisement advertisement) {
        executeInsideTransaction(entityManager -> entityManager.remove(advertisement));
        entityManager.remove(advertisement);
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
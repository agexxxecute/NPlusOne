package org.nplusone.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.nplusone.entity.Director;

import java.util.List;

public class DirectorDao {
    public List<Director> findAll(EntityManager em) {
        List<Director> directors = em.createQuery("from Director").getResultList();
        return directors;
    }

    public Director findById(int id, EntityManager em) {
        Director director = em.find(Director.class, id);
        return director;
    }
}

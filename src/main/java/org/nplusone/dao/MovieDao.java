package org.nplusone.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.nplusone.entity.Movie;

public class MovieDao {
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("examplePU");

    public Movie findById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Movie movie = entityManager.find(Movie.class, id);
        entityManager.close();
        return movie;
    }
}

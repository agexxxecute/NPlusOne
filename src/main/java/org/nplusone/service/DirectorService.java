package org.nplusone.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.nplusone.dao.DirectorDao;
import org.nplusone.dto.DirectorDTO;
import org.nplusone.entity.Director;
import org.nplusone.mapper.DirectorDtoMapper;
import org.nplusone.mapper.DirectorDtoMapperImpl;
import org.nplusone.mapper.DirectorNoMovieDtoMapperImpl;

import java.util.List;
import java.util.stream.Collectors;

public class DirectorService {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("examplePU");

    private DirectorDao directorDao = new DirectorDao();
    private DirectorDtoMapper directorDtoMapper = new DirectorDtoMapperImpl();

    public DirectorDTO findById(int id){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Director director = directorDao.findById(id, entityManager);
        DirectorDTO directorDTO = directorDtoMapper.toDTO(director);
        entityManager.close();
        return directorDTO;
    }

    public List<DirectorDTO> findAll(){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Director> directors = directorDao.findAll(entityManager);
        List<DirectorDTO> directorDTOS = directors.stream()
                .map(directorDtoMapper::toDTO)
                .collect(Collectors.toList());
        entityManager.close();
        return directorDTOS;
    }
}

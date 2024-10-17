package org.nplusone.service;

import org.nplusone.dao.MovieDao;
import org.nplusone.dto.MovieDTO;
import org.nplusone.entity.Movie;
import org.nplusone.mapper.MovieDtoMapper;
import org.nplusone.mapper.*;

public class MovieService {
    private MovieDao movieDao = new MovieDao();
    private MovieDtoMapper movieDtoMapper = new MovieDtoMapperImpl();

    public MovieDTO findById(int id) {
        Movie movie = movieDao.findById(id);
        MovieDTO movieDTO = movieDtoMapper.toDto(movie);
        return movieDTO;
    }
}

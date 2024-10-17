package org.nplusone.mapper;

import org.mapstruct.Mapper;
import org.nplusone.dto.MovieDTO;
import org.nplusone.entity.Movie;

@Mapper
public interface MovieDtoMapper {
    MovieDTO toDto(Movie movie);
}

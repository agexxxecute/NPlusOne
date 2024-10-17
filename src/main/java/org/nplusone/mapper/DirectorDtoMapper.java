package org.nplusone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.nplusone.dto.DirectorDTO;
import org.nplusone.entity.Director;

@Mapper (componentModel = "spring")
public interface DirectorDtoMapper {
    @Mapping(target = "movies", source = "movies")
    DirectorDTO toDTO(Director director);
}

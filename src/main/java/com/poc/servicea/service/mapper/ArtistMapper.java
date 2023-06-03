package com.poc.servicea.service.mapper;

import com.poc.servicea.domain.Artist;
import com.poc.servicea.service.dto.ArtistDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Artist} and its DTO {@link ArtistDTO}.
 */
@Mapper(componentModel = "spring")
public interface ArtistMapper extends EntityMapper<ArtistDTO, Artist> {}

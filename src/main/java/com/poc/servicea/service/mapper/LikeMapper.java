package com.poc.servicea.service.mapper;

import com.poc.servicea.domain.Artist;
import com.poc.servicea.domain.Like;
import com.poc.servicea.service.dto.ArtistDTO;
import com.poc.servicea.service.dto.LikeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Like} and its DTO {@link LikeDTO}.
 */
@Mapper(componentModel = "spring")
public interface LikeMapper extends EntityMapper<LikeDTO, Like> {
    @Mapping(target = "artwork", source = "artwork", qualifiedByName = "artistId")
    LikeDTO toDto(Like s);

    @Named("artistId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ArtistDTO toDtoArtistId(Artist artist);
}

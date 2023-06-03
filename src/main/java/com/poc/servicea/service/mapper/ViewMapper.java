package com.poc.servicea.service.mapper;

import com.poc.servicea.domain.Artist;
import com.poc.servicea.domain.View;
import com.poc.servicea.service.dto.ArtistDTO;
import com.poc.servicea.service.dto.ViewDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link View} and its DTO {@link ViewDTO}.
 */
@Mapper(componentModel = "spring")
public interface ViewMapper extends EntityMapper<ViewDTO, View> {
    @Mapping(target = "artwork", source = "artwork", qualifiedByName = "artistId")
    ViewDTO toDto(View s);

    @Named("artistId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ArtistDTO toDtoArtistId(Artist artist);
}

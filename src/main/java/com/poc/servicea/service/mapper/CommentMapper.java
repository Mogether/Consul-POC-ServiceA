package com.poc.servicea.service.mapper;

import com.poc.servicea.domain.Artist;
import com.poc.servicea.domain.Comment;
import com.poc.servicea.service.dto.ArtistDTO;
import com.poc.servicea.service.dto.CommentDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Comment} and its DTO {@link CommentDTO}.
 */
@Mapper(componentModel = "spring")
public interface CommentMapper extends EntityMapper<CommentDTO, Comment> {
    @Mapping(target = "artwork", source = "artwork", qualifiedByName = "artistId")
    CommentDTO toDto(Comment s);

    @Named("artistId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ArtistDTO toDtoArtistId(Artist artist);
}

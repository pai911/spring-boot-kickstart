package com.example.springbootkickstart.web.mappers;

import com.example.springbootkickstart.services.models.BookmarkDto;
import com.example.springbootkickstart.domain.entities.Bookmark;
import org.mapstruct.Mapper;

@Mapper
public interface BookmarkMapper {

    BookmarkDto entityToDto(Bookmark bookmark);

    Bookmark dtoToEntity(Bookmark dto);
}

package com.example.kickstart.web.mappers;

import com.example.kickstart.services.models.BookmarkDto;
import com.example.kickstart.domain.entities.Bookmark;
import org.mapstruct.Mapper;

@Mapper
public interface BookmarkMapper {

    BookmarkDto entityToDto(Bookmark bookmark);

    Bookmark dtoToEntity(Bookmark dto);
}

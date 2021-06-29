package com.example.springbootkickstart.services;

import com.example.springbootkickstart.services.models.BookmarkDto;

public interface BookmarkService {
    BookmarkDto getBookmark(Long id);
}

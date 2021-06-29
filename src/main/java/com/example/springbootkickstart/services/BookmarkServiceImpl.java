package com.example.springbootkickstart.services;

import com.example.springbootkickstart.domain.repositories.BookmarkRepository;
import com.example.springbootkickstart.services.exceptions.NotFoundException;
import com.example.springbootkickstart.services.models.BookmarkDto;
import com.example.springbootkickstart.web.mappers.BookmarkMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class BookmarkServiceImpl implements BookmarkService {
    private final BookmarkRepository bookmarkRepository;
    private final BookmarkMapper bookmarkMapper;

    @Override
    public BookmarkDto getBookmark(Long id) {
        return bookmarkMapper.entityToDto(
                bookmarkRepository.findById(id).orElseThrow(() -> new NotFoundException("Cannot find the bookmark"))
        );
    }
}

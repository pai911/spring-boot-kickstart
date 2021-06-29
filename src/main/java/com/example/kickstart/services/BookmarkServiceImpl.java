package com.example.kickstart.services;

import com.example.kickstart.domain.repositories.BookmarkRepository;
import com.example.kickstart.services.exceptions.NotFoundException;
import com.example.kickstart.services.models.BookmarkDto;
import com.example.kickstart.web.mappers.BookmarkMapper;
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

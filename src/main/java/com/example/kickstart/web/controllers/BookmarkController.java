package com.example.kickstart.web.controllers;

import com.example.kickstart.services.BookmarkService;
import com.example.kickstart.services.models.BookmarkDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@Validated
@RestController
@RequestMapping("/api/v1/bookmark")
public class BookmarkController {

    private final BookmarkService bookmarkService;

    @GetMapping("{bookmarkId}")
    public ResponseEntity<BookmarkDto> getBookmark(@PathVariable Long bookmarkId) {

        BookmarkDto bookmarkDto = bookmarkService.getBookmark(bookmarkId);

        return new ResponseEntity<>(bookmarkDto, HttpStatus.OK);
    }

    @PutMapping("{bookmarkId}")
    public ResponseEntity<BookmarkDto> updateBookmarks(@RequestBody BookmarkDto bookmark) {

        return new ResponseEntity<>(bookmark, HttpStatus.OK);
    }
}

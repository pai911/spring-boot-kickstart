package com.example.kickstart.bootstrap;

import com.example.kickstart.domain.entities.Bookmark;
import com.example.kickstart.domain.repositories.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@RequiredArgsConstructor
@Component
public class DataBootstrap implements CommandLineRunner {

    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {

        Bookmark bookmarkOne =
                Bookmark.builder().name("Sprin Boot Kickstart").url("http://www.example.com").build();

        Bookmark bookmarkTwo =
                Bookmark.builder().name("Google").url("http://www.google.com").build();

        Bookmark bookmarkThree =
                Bookmark.builder().name("Spring Boot").url("https://spring.io/projects/spring-boot").build();

        bookmarkRepository.saveAll(Arrays.asList(bookmarkOne, bookmarkTwo, bookmarkThree));
    }
}

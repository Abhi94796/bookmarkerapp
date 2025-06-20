package com.selflearning.bookmarker.impl;

import com.selflearning.bookmarker.domain.Bookmark;
import com.selflearning.bookmarker.repo.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {
        bookmarkRepository.save(new Bookmark(null, "springboot", "https://springboot.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test1", "https://test1.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test2", "https://test2.com", Instant.now()));
    }
}

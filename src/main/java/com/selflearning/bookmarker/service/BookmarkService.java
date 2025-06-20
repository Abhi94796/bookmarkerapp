package com.selflearning.bookmarker.service;

import com.selflearning.bookmarker.domain.Bookmark;
import com.selflearning.bookmarker.repo.BookmarkRepository;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {

    //RequiredArgsConstructor will initiate the repo
    private final BookmarkRepository bookmarkRepository;

    @Transactional(readOnly = true)
    public List<Bookmark> getBookmarks(){
        return bookmarkRepository.findAll();
    }
}

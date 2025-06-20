package com.selflearning.bookmarker.controller;

import com.selflearning.bookmarker.domain.Bookmark;
import com.selflearning.bookmarker.service.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkRestController {

    //RequiredArgsConstructor will inject the service
    private final BookmarkService bookmarkService;

    @GetMapping("/getAllBookmarks")
    private List<Bookmark> getBookmarks(){
        return bookmarkService.getBookmarks();
    }
}

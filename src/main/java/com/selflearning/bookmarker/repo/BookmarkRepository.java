package com.selflearning.bookmarker.repo;

import com.selflearning.bookmarker.domain.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
}

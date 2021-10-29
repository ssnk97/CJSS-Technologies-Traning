package com.cjss.bookjpa.repository;

import com.cjss.bookjpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository <Book, String> {
    public Book findByBookId(int bookId);
}

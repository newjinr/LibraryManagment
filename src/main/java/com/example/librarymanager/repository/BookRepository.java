package com.example.librarymanager.repository;

import com.example.librarymanager.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

//    List<Book> findByAuthorName(String authorName);

    @Query("SELECT b from Book b JOIN b.author a WHERE a.authorName = :title")
    List<Book> findBooksWithAuthor(@Param("title") String authorName);
}

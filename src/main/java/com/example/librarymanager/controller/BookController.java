package com.example.librarymanager.controller;

import com.example.librarymanager.model.Book;
import com.example.librarymanager.service.BookService;
import com.example.librarymanager.views.Views;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v3")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/getBook")
    @JsonView(Views.Internal.class)
    public List<Book> getBookByAuthorName() {
        return bookService.getBookByAuthorName();
    }
}

package com.example.librarymanager.service;

import com.example.librarymanager.model.Book;
import com.example.librarymanager.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public List<Book> getBookByAuthorName(){
        return bookRepository.findBooksWithAuthor("Alex Stone");
    }
}

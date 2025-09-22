package com.example.librarymanager.controller;

import com.example.librarymanager.model.Author;
import com.example.librarymanager.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public List<Author> getAuthorList(){
        return authorService.getAuthorList();
    }
}

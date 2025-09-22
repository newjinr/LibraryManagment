package com.example.librarymanager.service;

import com.example.librarymanager.model.Author;
import com.example.librarymanager.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public List<Author> getAuthorList(){
        return authorRepository.findAll();
    }
}

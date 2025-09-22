package com.example.librarymanager.model;

import com.example.librarymanager.views.Views;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "AuthorsTable")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Author extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AuthorID", nullable = false, updatable = false)
    private Long authorID;

    @Column(name = "AuthorName")
    @JsonView(value = Views.Internal.class)
    private String authorName;
}

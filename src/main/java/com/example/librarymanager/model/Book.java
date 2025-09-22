package com.example.librarymanager.model;

import com.example.librarymanager.views.Views;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BooksTable")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BooksID")
    private Long id;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "Title")
    private String title;

    private String subTitle;

    @ManyToOne
    @JoinColumn(name = "AuthorsID")
    @JsonView(Views.Internal.class)
    private Author author;

    @Column(name = "PublishedDate")
    private Long publishedDate;

    @Column(name = "Publisher")
    private String publisher;

    @Column(name = "Pages")
    private Integer pages;

    @Column(name = "Description")
    private String description;

    @Column(name = "Website")
    private String website;

    @Column(name = "CopiesAvailable")
    private Integer copiesAvailable;
}
package com.example.librarymanager.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class Auditable {

    @Column(name = "CreatedBy")
    private Long createdBy;

    @Column(name = "LastModifiedBy")
    private Long lastModifiedBy;

    @Column(name = "CreatedAt")
    private Long createdAt;

    @Column(name = "LastModifiedAt")
    private Long lastModifiedAt;
}

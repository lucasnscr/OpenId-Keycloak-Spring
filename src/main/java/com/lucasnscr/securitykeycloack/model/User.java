package com.lucasnscr.securitykeycloack.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "_user")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {

    public User() {
        this.createdAt = Instant.now();
    }

    public User(String name, String document, String email) {
        this.name = name;
        this.document = document;
        this.email = email;
        this.createdAt = Instant.now();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "document")
    private String document;

    @Column(name = "email")
    private String email;

    @Column(name = "createdAt")
    private Instant createdAt;

}

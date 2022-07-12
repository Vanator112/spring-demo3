package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nume")
    private String nume;
    @Column(name="data_aparitie")
    private String data_aparitie;
    @Column(name="numar_pagini")
    private int numar_pagini;
    @Column(name="numar_copii")
    private int numar_copii;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Author> authorList;

}


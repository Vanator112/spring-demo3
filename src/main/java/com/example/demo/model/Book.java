package com.example.demo.model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class Book {

    private String nume;

    private String data_aparitie;

    private int numar_pagini;

    private int numar_copii;

}


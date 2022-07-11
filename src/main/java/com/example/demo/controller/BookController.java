package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping(value = "/createBook")
    @ResponseBody
    public String createBook(){

        Book book= Book.builder()
                .nume("Ion")
                .data_aparitie("20 november 1920")
                .numar_pagini(448)
                .numar_copii(15000)
                .build();
        bookRepository.save(book);

        return "";
    }
}

package com.example.demo.controller;

import com.example.demo.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.repository.AuthorRepository;

@Controller
public class AuthorController{

    @Autowired
    AuthorRepository authorRepository;

    @GetMapping(value = "/createAuthor")
    @ResponseBody
    public String createAuthor(){

        Author author= Author.builder()
                .nume("Liviu Rebreanu")

                .build();
        authorRepository.save(author);

        return "";
    }
}

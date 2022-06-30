package com.example.demo.controller;

import com.example.demo.model.Autor;
import com.example.demo.model.Carte;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping(value = "/author")
    public String autor(Model model){

        List<Autor> autorList =List.of(
                new Autor("Margaret Mitchell", "Pe aripile vantului"),
                new Autor("Jane Austen","Mândrie și prejudecata"),
                new Autor("Camil Petrescu","Patul lui Procust")
        );
        model.addAttribute("autorList", autorList);

        return "author";
    }

    @GetMapping(value = "/book")
    public String carte(Model model){

        List<Carte> carteList =List.of(
                new Carte("Pe aripile vantului", "May 1936", 1037, 180000),
                new Carte("Mandrie si prejudecata", "January 1813", 512, 1500),
                new Carte ("Patul lui Procust", "February 1933", 500, 15000 )
        );
        model.addAttribute("carteList", carteList);

        return "book";

    }

    @GetMapping(value = "/Fbook")
    public String Fbook()
    {
        return "Fbook";
    }

    @GetMapping(value = "/Fauthor")
    public String Fauthor()
    {
        return "Fauthor";
    }

    @GetMapping(value = "/index")
    public String Index()
    {
        return "index";
    }
}

package com.example.demo.controller;

import com.example.demo.model.Autor;
import com.example.demo.model.Carte;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping(value = "/autor")
    public String autor(Model model){

        List<Autor> autorList =List.of(
                new Autor("Margaret Mitchell", "Pe aripile vantului"),
                new Autor("Jane Austen","Mândrie și prejudecata"),
                new Autor("Camil Petrescu","Patul lui Procust")
        );
        model.addAttribute("autorList", autorList);

        return "autor";
    }

    @GetMapping(value = "/carte")
    public String carte(Model model){

        List<Carte> carteList =List.of(
                new Carte("Pe aripile vantului", "Mai 1936", 1037, 180000),
                new Carte("Mandrie si prejudecata", "Ianuarie 1813", 512, 1500),
                new Carte ("Patul lui Procust", "Februarie 1933", 500, 15000 ),
                new Carte ("Ferma animalelor", "Februarie 160", 250, 1000 )
        );
        model.addAttribute("carteList", carteList);

        return "carte";

    }

}

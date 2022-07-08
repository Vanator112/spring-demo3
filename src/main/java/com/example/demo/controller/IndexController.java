package com.example.demo.controller;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping(value = "/author")
    public String author(Model model){

        List<Author> authorList =List.of(
                /*new Author("Margaret Mitchell", "Pe aripile vantului"),
                new Author("Jane Austen","Mândrie și prejudecata"),
                new Author("Camil Petrescu","Patul lui Procust")*/
        );
        model.addAttribute("authorList", authorList);

        return "author";
    }

    @GetMapping(value = "/book")
    public String book(Model model){

        List<Book> bookList =List.of(
                /*new Book("Pe aripile vantului", "May 1936", 1037, 180000),
                new Book("Mandrie si prejudecata", "January 1813", 512, 1500),
                new Book("Patul lui Procust", "February 1933", 500, 15000 )*/
        );
        model.addAttribute("bookList", bookList);

        return "book";

    }

    @GetMapping(value = "/Fbook")
    public String Fbook(Model model)
    {
        Book myBook = Book.builder().build();
        model.addAttribute("Book", myBook);
        return "Fbook";
    }

    @GetMapping(value = "/Fauthor")
    public String Fauthor(Model model)
    {
        Author myAuthor = Author.builder().build();
        model.addAttribute("Author", myAuthor);
        return "Fauthor";
    }

    @GetMapping(value = "/index")
    public String Index()
    {
        return "index";
    }

    @PostMapping(value = "/submitAuthor")
    public String submitAuthor(@ModelAttribute Author Author){
        System.out.println(Author.toString());
        saveToDataBase(Author);
        return "index";
    }

    private void saveToDataBase(Author author) {

    }

    @PostMapping(value = "/submitBook")
    public String submitBook(@ModelAttribute Book Book){
        System.out.println(Book.toString());
        return "index";
    }
}

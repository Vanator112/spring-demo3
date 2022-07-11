package com.example.demo.controller;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    AuthorRepository authorRepository;
    @GetMapping(value = "/author")
    public String author(Model model){

        List<Author> authorList = authorRepository.findAll();
        model.addAttribute("authorList", authorList);

        return "author";
    }
    BookRepository bookRepository;
    @GetMapping(value = "/book")
    public String book(Model model){

        List<Book> bookList = bookRepository.findAll();
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
    public String submitAuthor(@ModelAttribute Author Author, Model model){
        System.out.println(Author.toString());
        saveToDataBase(Author);
        return "redirect:/author";
    }

    private void saveToDataBase(Author author) {
        authorRepository.save(author);
    }

    @PostMapping(value = "/submitBook")
    public String submitBook(@ModelAttribute Book Book, Model model){
        System.out.println(Book.toString());
        saveToDataBase1(Book);
        return "redirect:/book";
    }

    private void saveToDataBase1(Book book) {
        bookRepository.save(book);
    }
}

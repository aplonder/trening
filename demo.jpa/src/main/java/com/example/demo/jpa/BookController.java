package com.example.demo.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Book> findAll() {
        return bookService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody Book book) {
        bookService.create(book);
    }
}

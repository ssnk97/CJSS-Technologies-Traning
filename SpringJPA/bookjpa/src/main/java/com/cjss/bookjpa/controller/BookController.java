package com.cjss.bookjpa.controller;

import com.cjss.bookjpa.entity.Book;
import com.cjss.bookjpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value ="/savebook", method = RequestMethod.POST)
   // @RequestBody
    public Book saveBook(@RequestBody Book book) {
        Book bookResponse = bookService.saveBook(book);
        return bookResponse;
    }

    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
    public Book getBookDetails(@PathVariable int bookId){
        Book bookResponse = bookService.findById(bookId);
        return bookResponse;
    }
}

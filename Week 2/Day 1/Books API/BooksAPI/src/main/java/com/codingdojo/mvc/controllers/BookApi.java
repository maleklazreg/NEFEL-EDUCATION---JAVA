package com.codingdojo.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@RestController
public class BooksApi {
    private final BookService bookService;

    public BooksApi(BookService bookService) {
        this.bookService = bookService;
    }

    // Get all books
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }

    // Create a book
    @RequestMapping(value = "/api/books", method = RequestMethod.POST)
    public Book create(
            @RequestParam(value = "title") String title,
            @RequestParam(value = "description") String description,
            @RequestParam(value = "language") String language,
            @RequestParam(value = "pages") Integer numberOfPages) {
        Book book = new Book(title, description, language, numberOfPages);
        return bookService.createBook(book);
    }

    // Get a book by ID
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        return bookService.findBook(id);
    }

    // Update a book
    @RequestMapping(value = "/api/books/{id}", method = RequestMethod.PUT)
    public Book update(
            @PathVariable("id") Long id,
            @RequestParam(value = "title") String title,
            @RequestParam(value = "description") String desc,
            @RequestParam(value = "language") String lang,
            @RequestParam(value = "pages") Integer numOfPages) {
        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }

    // Delete a book
    @RequestMapping(value = "/api/books/{id}", method = RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}
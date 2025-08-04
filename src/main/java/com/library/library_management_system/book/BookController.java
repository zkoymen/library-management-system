package com.library.library_management_system.book;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // This creates REST API endpoints (returns JSON data)
@RequestMapping(path = "api/v1/books") // Base URL for all methods in this class
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // GET http://localhost:8080/api/v1/books
    @GetMapping
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }

    // POST http://localhost:8080/api/v1/books
    @PostMapping
    public Book registerNewBook(@RequestBody Book book) {
        // @RequestBody maps the JSON body of the request to a Book object
        return bookService.addNewBook(book);
    }

    // DELETE http://localhost:8080/api/v1/books/1
    @DeleteMapping(path = "{bookId}")
    public void deleteBook(@PathVariable("bookId") Long bookId) {
        // @PathVariable takes the 'bookId' from the URL
        bookService.deleteBook(bookId);
    }
}
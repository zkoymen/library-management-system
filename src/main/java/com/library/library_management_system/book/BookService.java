package com.library.library_management_system.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Marks this as a Spring service (business logic layer)
public class BookService {

    private final BookRepository bookRepository;

    @Autowired // Spring automatically provides the BookRepository instance
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Method to get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Method to add a new book
    public Book addNewBook(Book book) {
        Optional<Book> bookOptional = bookRepository.findBookByIsbn(book.getIsbn());
        if (bookOptional.isPresent()) {
            // If the book exists, throw an error
            throw new IllegalStateException("ISBN " + book.getIsbn() + " is already registered.");
        }
        // If it doesn't exist, save the new book
        return bookRepository.save(book);
    }

    // Method to delete a book
    public void deleteBook(Long bookId) {
        boolean exists = bookRepository.existsById(bookId);
        if (!exists) {
            throw new IllegalStateException("Book with id " + bookId + " does not exist");
        }
        bookRepository.deleteById(bookId);
    }

    // Method to get a single book by its ID
    public Book getBookById(Long bookId) {
        // .findById() returns an Optional, which is a container that may or may not
        // hold a value. This is a safe way to handle cases where the book isn't found.
        return bookRepository.findById(bookId)
                .orElseThrow(() -> new IllegalStateException("Book with id " + bookId + " does not exist"));
    }
}

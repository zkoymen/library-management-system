package com.library.library_management_system.view;

import com.library.library_management_system.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    // Inject the BookService so we can use it
    private final BookService bookService;

    @Autowired
    public ViewController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/")
    public String getHomePage() {
        // This just returns the name of the single HTML file. Nothing else.
        return "index";
    }

    // NEW METHOD for books page redirection
    @GetMapping("/books")
    public String getBooksPage(Model model) {
        // 1. Call the service to get all books
        // 2. Add the list of books to the model, so the HTML page can access it
        model.addAttribute("books", bookService.getAllBooks());

        // 3. Return the name of the HTML file to display
        return "books";
    }
}
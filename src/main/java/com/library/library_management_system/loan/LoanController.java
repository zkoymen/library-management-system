package com.library.library_management_system.loan;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/loans")
public class LoanController {

    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    // Example: POST http://localhost:8080/api/v1/loans?bookId=1&memberId=1
    @PostMapping
    public Loan borrowBook(@RequestParam Long bookId, @RequestParam Long memberId) {
        return loanService.borrowBook(bookId, memberId);
    }
}
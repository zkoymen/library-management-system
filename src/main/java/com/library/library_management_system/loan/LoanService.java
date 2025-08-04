package com.library.library_management_system.loan;


import com.library.library_management_system.book.Book;
import com.library.library_management_system.book.BookRepository;
import com.library.library_management_system.member.Member;
import com.library.library_management_system.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
public class LoanService {

    private final LoanRepository loanRepository;
    private final BookRepository bookRepository;
    private final MemberRepository memberRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository, BookRepository bookRepository, MemberRepository memberRepository) {
        this.loanRepository = loanRepository;
        this.bookRepository = bookRepository;
        this.memberRepository = memberRepository;
    }

    @Transactional
    public Loan borrowBook(Long bookId, Long memberId) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new IllegalStateException("Book not found with ID: " + bookId));
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new IllegalStateException("Member not found with ID: " + memberId));

        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is currently on loan.");
        }

        book.setAvailable(false);
        bookRepository.save(book);

        Loan loan = new Loan();
        loan.setBook(book);
        loan.setMember(member);
        loan.setLoanDate(LocalDate.now());

        return loanRepository.save(loan);
    }

    @Transactional
    public Loan returnBook(Long loanId) {
        // 1. Find the loan record by its ID. If it doesn't exist, throw an error.
        Loan loan = loanRepository.findById(loanId)
                .orElseThrow(() -> new IllegalStateException("No loan found with ID: " + loanId));

        // 2. Check if the book has already been returned to prevent errors.
        if (loan.getReturnDate() != null) {
            throw new IllegalStateException("This book has already been returned.");
        }

        // 3. Set the return date to now.
        loan.setReturnDate(LocalDate.now());

        // 4. Get the book that is part of this loan and set its status back to available.
        Book book = loan.getBook();
        book.setAvailable(true);
        bookRepository.save(book); // Don't forget to save the updated book!

        // 5. Save the updated loan record and return it.
        return loanRepository.save(loan);
    }


}

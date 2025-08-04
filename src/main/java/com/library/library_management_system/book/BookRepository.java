package com.library.library_management_system.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // We can add custom finder methods here later if we need them!

    Optional<Book> findBookByIsbn(String isbn);

}

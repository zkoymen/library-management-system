package com.library.library_management_system.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    // Spring Data JPA can automatically create a query from the method name.
    // This will help us prevent registering members with the same email.
    Optional<Member> findByEmail(String email);
}
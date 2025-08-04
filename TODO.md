# Project TODO List

This file tracks the development tasks for the Library Management System.

## Phase 1: MVP (Minimum Viable Product)

### Milestone 1: Project Setup & Core Models
- [ ] Initialize Spring Boot project via Spring Initializr.
- [ ] Add dependencies: `Spring Web`, `Spring Data JPA`, `H2 Database`, `Thymeleaf`.
- [ ] Create the `Book` entity class (`@Entity`).
- [ ] Create the `Member` entity class (`@Entity`).
- [ ] Create the `Loan` entity class (`@Entity`).
- [ ] Set up basic application properties for the H2 database.

### Milestone 2: Book Management (CRUD)
- [ ] Create `BookRepository` interface (`extends JpaRepository`).
- [ ] Create `BookService` class with business logic (add, find, update, delete).
- [ ] Create `BookController` to handle web requests.
- [ ] Create Thymeleaf view (`books.html`) to display all books.
- [ ] Create Thymeleaf view (`add-book.html`) with a form to add a new book.
- [ ] Create Thymeleaf view (`edit-book.html`) with a form to update a book.
- [ ] Implement the delete book functionality.

### Milestone 3: Member Management (CRUD)
- [ ] Create `MemberRepository` interface.
- [ ] Create `MemberService` class.
- [ ] Create `MemberController`.
- [ ] Create Thymeleaf view (`members.html`) to display all members.
- [ ] Create Thymeleaf view (`add-member.html`) to register a new member.
- [ ] Implement update and delete functionality for members.

### Milestone 4: Loan Management
- [ ] Create `LoanRepository` interface.
- [ ] Enhance `BookService` and `MemberService` to handle loan logic.
- [ ] Create a `LoanController` or add endpoints to existing controllers.
- [ ] Create a Thymeleaf view (`lend-book.html`) for the librarian to issue a book.
- [ ] Implement the "Return Book" functionality.
- [ ] Create a "My Books" page for a logged-in member (post-MVP feature but good to plan).

## Phase 2: Future Enhancements
- [ ] Implement Spring Security for user authentication (Librarian vs. Member roles).
- [ ] Add a search feature for books.
- [ ] Implement validation for all forms.
- [ ] Add due dates and an "overdue books" report.
- [ ] Switch from H2 to a persistent database like PostgreSQL.
- [ ] Write unit and integration tests.
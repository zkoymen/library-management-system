# Project TODO List - Library Management System (Monolith)

This file tracks the development tasks for the single-application Library Management System.

## Phase 1: MVP Backend (REST APIs)

### Milestone 1: Project Setup & Core Models
- [x] Initialize Spring Boot project.
- [x] Add dependencies: `Spring Web`, `Spring Data JPA`, `H2 Database`, `Thymeleaf`.
- [x] Create the `Book` entity class.
- [x] Create the `Member` entity class.
- [x] Create the `Loan` entity class.
- [x] Set up basic H2 database configuration.

### Milestone 2: Book Management API
- [x] Create `BookRepository`, `BookService`, `BookController`.
- [x] Implement API endpoints for GET all, GET by ID, POST (add), and DELETE book.

### Milestone 3: Member Management API
- [x] Create `MemberRepository`, `MemberService`, `MemberController`.
- [x] Implement API endpoints for GET all, GET by ID, POST (add), and DELETE member.

### Milestone 4: Loan Management API
- [x] Create `LoanRepository`, `LoanService`, `LoanController`.
- [x] Implement API endpoint to **Borrow** a Book.
- [ ] Implement API endpoint to **Return** a Book.  <-- **THIS IS OUR NEXT STEP.**

---

## Phase 2: MVP Frontend (A User-Friendly UI)

### Milestone 5: UI Foundation & Styling
- [ ] Add Bootstrap for a professional look.
- [ ] Create a main layout template with a consistent navigation menu and footer.
- [ ] Create a welcoming Home Page.

### Milestone 6: Book Management UI
- [ ] Create a page to display all books in a table.
- [ ] Create a form page to add a new book.
- [ ] Implement "Delete" functionality from the UI.

### Milestone 7: Member Management UI
- [ ] Create a page to display all members.
- [ ] Create a form page to register a new member.

### Milestone 8: Loan Management UI
- [ ] Create a page to display all active loans.
- [ ] Implement "Return Book" functionality with a button.
- [ ] Create a "Lend Book" page with user-friendly dropdowns.

---

## Phase 3: Future Enhancements
- [ ] Implement User Login/Registration (Authentication & Authorization).
- [ ] Implement robust form validation.
- [ ] Add a search feature.
- [ ] Write unit tests.
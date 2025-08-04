# Simple Library Management System

This is a web-based Library Management System built with Java and the Spring Boot framework. The goal of this project is to provide a simple, robust application to manage a library's book inventory, its members, and the borrowing process.

This project is being developed as a learning exercise to demonstrate a solid understanding of backend development principles and the Spring ecosystem.

## Vision

To create an efficient and user-friendly application that automates the core processes of a small library, including book tracking, member registration, and loan management.

## Core Features (MVP)

### Admin/Librarian Features
- **Book Management:** Add, view, update, and delete books from the library catalog.
- **Member Management:** Register, view, update, and remove library members.
- **Loan Management:** Lend books to members and process book returns.

### Member-Facing Features
- View a list of all available books.
- See a personal dashboard of currently borrowed books.

## Technology Stack

- **Backend:**
    - Java 17+
    - Spring Boot 3.x
    - Spring Web (for REST APIs and MVC)
    - Spring Data JPA (for database interaction)
    - Thymeleaf (Server-side template engine for the UI)
- **Database:**
    - H2 Database (for development & testing)
    - PostgreSQL / MySQL (for production - planned)
- **Build Tool:**
    - Maven

## How to Run (Development)

1.  **Prerequisites:**
    - JDK 21 or later installed.
    - Apache Maven installed.

2.  **Clone the repository:**
    ```bash
    git clone https://github.com/zkoymen/library-management-system.git
    cd your-repo-name
    ```

3.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```

4.  **Access the application:**
    Open your web browser and navigate to `http://localhost:8080`.

package com.example.springresthelloword.error;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super(String.format("Book id not found: %s", id));
    }
}

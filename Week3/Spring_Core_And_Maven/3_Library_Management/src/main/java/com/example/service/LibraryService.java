package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class LibraryService {
    public void displayBooks() {
        System.out.println("Available books: Java, Spring, Hibernate");
    }
}

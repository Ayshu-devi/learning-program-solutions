package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.service.LibraryService;

public class App {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the LibraryService bean
        LibraryService libraryService = context.getBean(LibraryService.class);

        // Call a method
        libraryService.displayBooks();
    }
}

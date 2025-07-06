package com.example;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.service.BookService;

public class AppTest {

    @Test
    public void testBookServiceBeanLoaded() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = context.getBean("bookService", BookService.class);
        assertNotNull("BookService bean should not be null", service);
    }
}

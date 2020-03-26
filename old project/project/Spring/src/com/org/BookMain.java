package com.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BookMain {
    public static void main(String[] args) throws Exception {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("/src/com/org/ApplicationContext.xml");
        Book book = (Book) context.getBean(Book.class);
        book.display();
        context.close();
    }
}

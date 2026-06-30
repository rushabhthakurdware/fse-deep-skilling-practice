package com.example.agent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.agent.Service.BookService;

import java.awt.print.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService book = app.getBean("BookService",BookService.class);
        book.addBook();
    }
}

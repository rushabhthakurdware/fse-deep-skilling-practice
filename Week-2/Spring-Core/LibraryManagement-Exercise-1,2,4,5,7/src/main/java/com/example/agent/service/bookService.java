package com.example.agent.service;

import com.example.agent.repository.bookRepository;

public class bookService {
    private  bookRepository bookRepository;
    public void setBookService(){
        this.bookRepository = bookRepository;
    }
    public void saveBook(){
        System.out.println("book saved");
        bookRepository.addBook();
    }
}

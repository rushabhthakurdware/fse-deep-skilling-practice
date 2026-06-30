package com.example.agent.Service;

import com.example.agent.repository.BookRepository;

public class BookService {

        private BookRepository repository;
//   this method is for exercise-2,7
//   where we need to create setRepository  becuz when spring internally sees
//    <properties name = "repository" ref = "bookRepository" it internally creates  bookservice
//    object and called saveBook()method;

//    this is setter injection
    public void setRepository(BookRepository repository){
        this.repository = repository;
    }
//    this is Constructor injection
//    public BookService(BookRepository repository) {
//        this.repository = repository;
//    }
    public  void  addBook(){
        System.out.println("book service called");
         repository.saveBook();
    }
}

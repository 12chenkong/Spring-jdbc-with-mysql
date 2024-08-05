package com.telusko.SpringJDBCEx.service;

import com.telusko.SpringJDBCEx.model.Book;
import com.telusko.SpringJDBCEx.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServices {

    BookRepo bookRepo;
    //contractor injection
    public BookServices(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAllBook(){
     return bookRepo.fetchAllBook();
    }
    public void save(Book book){
         bookRepo.saveBook(book);

    }
}

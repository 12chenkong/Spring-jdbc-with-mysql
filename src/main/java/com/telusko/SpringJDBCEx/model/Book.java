package com.telusko.SpringJDBCEx.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Book {
    private int book_id;
    private String book_name;
    private String author;

    public Book(){}
    public Book(int book_id, String book_name, String author) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.author = author;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

package com.telusko.SpringJDBCEx.model;

import org.springframework.stereotype.Component;

@Component
public class BookStudentInfo {
    private int rollNum;
    private String name;
    private String author_name;
    private String book_name;

    public BookStudentInfo(){}
    public BookStudentInfo(int rollNum, String name, String author_name, String book_name) {
        this.rollNum = rollNum;
        this.name = name;
        this.author_name = author_name;
        this.book_name = book_name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    @Override
    public String toString() {
        return "BookStudentInfo{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", author_name='" + author_name + '\'' +
                ", book_name='" + book_name + '\'' +
                '}';
    }
}

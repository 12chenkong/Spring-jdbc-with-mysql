package com.telusko.SpringJDBCEx.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private int rollNum;
    private String name;
    private int mark;
    private int book_id_fk;

    public int getrollNum() {
        return rollNum;
    }

    public void setrollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getBook_id_fk() {
        return book_id_fk;
    }

    public void setBook_id_fk(int book_id_fk) {
        this.book_id_fk = book_id_fk;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                ", book_id_fk=" + book_id_fk +
                '}';
    }
}

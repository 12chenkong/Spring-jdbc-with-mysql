package com.telusko.SpringJDBCEx.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private int nollNum;
    private String name;
    private int mark;

    public int getNollNum() {
        return nollNum;
    }

    public void setNollNum(int nollNum) {
        this.nollNum = nollNum;
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

    @Override
    public String toString() {
        return "Student{" +
                "nollNum=" + nollNum +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}

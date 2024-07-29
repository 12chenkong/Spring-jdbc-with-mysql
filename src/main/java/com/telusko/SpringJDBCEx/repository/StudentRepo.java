package com.telusko.SpringJDBCEx.repository;

import com.telusko.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.telusko.SpringJDBCEx.model.BookStudentInfo;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
     //setter injection
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public  void save (Student student){
      String sql="INSERT INTO student(rollNum,name,mark)  VALUES(?,?,?)";
      int row= jdbc.update(sql,student.getNollNum(),student.getName(),student.getMark());
        System.out.println(row +"affected");
    }

    public List<BookStudentInfo> findAll() {
     String sql="SELECT S.rollNum, S.name, B.author, B.book_name " +
             "FROM book AS B " +
             "JOIN student AS S ON B.book_id = S.book_id_FK";
        RowMapper<BookStudentInfo> rowMapper=new RowMapper<BookStudentInfo>() {
            @Override
            public BookStudentInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
                BookStudentInfo bookStudentInfo=new BookStudentInfo();
                bookStudentInfo.setRollNum(rs.getInt("rollNum"));
                bookStudentInfo.setName(rs.getString("name"));
                bookStudentInfo.setAuthor_name(rs.getString("author"));
                bookStudentInfo.setBook_name(rs.getString("book_name"));
                return bookStudentInfo;
            }
        };

        return jdbc.query(sql,rowMapper) ;
    }
}

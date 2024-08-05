package com.telusko.SpringJDBCEx.repository;

import com.telusko.SpringJDBCEx.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class BookRepo {
    JdbcTemplate jdbc;
  // contractor Injection
    @Autowired
    public BookRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
 //fetching data from the book table
    public List<Book> fetchAllBook(){
        String sql="SELECT*FROM book";
        RowMapper<Book> rowMapper=new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
                Book book=new Book();
                book.setBook_name(rs.getString("book_name"));
                book.setAuthor(rs.getString("author"));
                return book;
            }
        };
        return jdbc.query(sql,rowMapper);
    }
    //inserting data into the book table
    public void saveBook(Book book){
        String sql="INSERT INTO book VALUES(?,?,?)";
        int row=jdbc.update(sql,book.getBook_id(),book.getBook_name(),book.getAuthor());
        System.out.println(row+"affected");
    }


}

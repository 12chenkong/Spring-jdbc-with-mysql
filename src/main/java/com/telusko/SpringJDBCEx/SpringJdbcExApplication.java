package com.telusko.SpringJDBCEx;

import com.telusko.SpringJDBCEx.model.BookStudentInfo;
import com.telusko.SpringJDBCEx.model.Student;
import com.telusko.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

	ApplicationContext context= SpringApplication.run(SpringJdbcExApplication.class, args);
		StudentService studentService=context.getBean(StudentService.class);
		// adding students to studentService class
		List<BookStudentInfo>students=studentService.getStudents();
		System.out.println(students);


	}

}

package com.telusko.SpringJDBCEx;

import com.telusko.SpringJDBCEx.model.Book;
import com.telusko.SpringJDBCEx.model.BookStudentInfo;
import com.telusko.SpringJDBCEx.model.Student;
import com.telusko.SpringJDBCEx.service.BookServices;
import com.telusko.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	ApplicationContext context= SpringApplication.run(SpringJdbcExApplication.class, args);
		StudentService studentService=context.getBean(StudentService.class);
          Student student=new Student();
		  /*
		System.out.println("enter your Id:");
		  student.setrollNum(scanner.nextInt());
		System.out.println("Enter your name: ");
		scanner.nextLine();
		  student.setName(scanner.nextLine());
		System.out.println("Enter your mark: ");
		  student.setMark(scanner.nextInt());
		System.out.println("Enter book id: ");
		  student.setBook_id_fk(scanner.nextInt());
		  studentService.addStudent(student);

		   */
		// adding students to studentService class
		BookServices bookServices=context.getBean(BookServices.class);
		System.out.println(studentService.getAllStudent());






	}

}

package com.telusko.SpringJDBCEx;

import com.telusko.SpringJDBCEx.model.Book;
import com.telusko.SpringJDBCEx.model.BookStudentInfo;
import com.telusko.SpringJDBCEx.model.Student;
import com.telusko.SpringJDBCEx.service.BookServices;
import com.telusko.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringJdbcExApplication {



	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	ApplicationContext context= SpringApplication.run(SpringJdbcExApplication.class, args);
		StudentService studentService=context.getBean(StudentService.class);
		BookServices bookServices=context.getBean(BookServices.class);
          Student student=new Student();
		  int option;
		  do {
			  System.out.println("1.View book");
			  System.out.println("2.View Student");
			  System.out.println("exit the program");
			  System.out.println("Choose one them!");
			  option=scanner.nextInt();

			  switch (option){
				  case 1:
					  int num;
					  do {
						  System.out.println("Welcome to student section");
					      System.out.println("1.See all students");
						  System.out.println("2.Insert student's info");
						  System.out.println("3.search student by id");
						  System.out.println("4.Go back ");
						   num=scanner.nextInt();
						  switch (num){
							  case 1:
								  System.out.println(studentService.getAllStudent());
								  break;
							  case 2:
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
								  break;
							  case 3:
								  System.out.println("Please enter student's id search");
								  int searchId=scanner.nextInt();
								  student= studentService.searchStudentById(searchId);
								  if(student==null){
									  System.out.println("student does not exist!!");
								  }else {
									  System.out.println(student);
								  }
								  break;
							  default:
								  System.out.println("Invalid input");

						  }
						 }while (num!=4);
						  break;
				  case 2:
					  System.out.println("welcome to book section");
					  System.out.println("1.see all books");
					  System.out.println("2.Insert book's info");
					  System.out.println("Please chose one of them");
					  int num2=scanner.nextInt();
					  switch (num2){
						  case 1:
							  List<Book> bookList=new ArrayList<>();
							  bookList=bookServices.getAllBook();
							  for(Book book:bookList){
								  System.out.println("Book's id:"+book.getBook_id());
								  System.out.println("Book's name:"+book.getBook_name());
								  System.out.println("Author's name:"+book.getAuthor());
							  }
							  break;
						  case 2:
							  Book book=new Book();
							  System.out.println("Enter book's name");
							  book.setBook_name(scanner.nextLine());
							  scanner.nextLine();
							  System.out.println("Enter book's id:");
							  book.setBook_id(scanner.nextInt());
							  System.out.println("Enter author name:");
							  book.setAuthor(scanner.nextLine());
								bookServices.save(book);
							  break;
						  default:
							  System.out.println("invalid input!");
					  }

					  break;



			  }

		  }while (option!=3);



	}

}

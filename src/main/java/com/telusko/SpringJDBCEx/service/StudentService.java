package com.telusko.SpringJDBCEx.service;

import com.telusko.SpringJDBCEx.model.BookStudentInfo;
import com.telusko.SpringJDBCEx.model.Student;
import com.telusko.SpringJDBCEx.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    StudentRepo studentRepo;
    //setter injection
    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student){
      studentRepo.save(student);
   }
   public List<Student> getAllStudent(){
      return   studentRepo.showAllStudent();
   }
    public List<BookStudentInfo> getStudents() {
        return studentRepo.findAll();
    }
}

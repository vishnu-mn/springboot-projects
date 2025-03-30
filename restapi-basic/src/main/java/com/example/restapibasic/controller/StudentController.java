package com.example.restapibasic.controller;

import com.example.restapibasic.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(1,"samplefname","samplelname");
        return student;
    }
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1,"samplefname","samplelname"));
        students.add(new Student(2,"samplefname2","samplelname2"));
        return students;
    }
}

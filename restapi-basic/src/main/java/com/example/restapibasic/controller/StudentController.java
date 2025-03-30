package com.example.restapibasic.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.restapibasic.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(1,"samplefname","samplelname");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @GetMapping("students")
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1,"samplefname","samplelname"));
        students.add(new Student(2,"samplefname2","samplelname2"));
        return ResponseEntity.ok(students);
    }
    @GetMapping("students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") int studentId){
        Student student = new Student(studentId,"samplefname","samplelname");
        return ResponseEntity.ok(student);
    }
    @GetMapping("students/query")
    public ResponseEntity<Student> getStudentRequest(@RequestParam int id){
        Student student = new Student(id,"samplefname","samplelname");
        return ResponseEntity.ok(student);
    }
    @PostMapping("students/create")
//    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student){//requestbody converts json to java object
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
    @PutMapping("students/{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable int id){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return ResponseEntity.ok(student);
    }
    @DeleteMapping("students/{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable int id){
        System.out.println(id);
        return ResponseEntity.ok("student deleted");
    }
}

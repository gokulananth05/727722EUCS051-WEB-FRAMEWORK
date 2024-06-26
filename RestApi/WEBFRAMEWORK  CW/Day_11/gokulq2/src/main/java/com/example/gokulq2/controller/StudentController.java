package com.example.gokulq2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.gokulq2.model.Student;
import com.example.gokulq2.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentController {
    public StudentService studentService;
    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public Student postMethodName(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<Student> getMethodName() {
        return studentService.getStudents();
    }
    
}

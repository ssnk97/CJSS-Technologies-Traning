package com.cjss.studentapi.controller;

import com.cjss.studentapi.model.Student;
import com.cjss.studentapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add-student")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/task1")
    public List<Student> task1(){
        return studentService.task1();
    }

    @GetMapping("/task2")
    public List<Student> task2(){
        return studentService.task2();
    }

    @GetMapping("/task3")
    public List<Student> task3(){
        return studentService.task3();
    }

    @GetMapping("/task4")
    public List<Student> task4(){
        return studentService.task4();
    }
}

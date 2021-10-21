package com.cjss.studentupdate.controller;

import com.cjss.studentupdate.model.Student;
import com.cjss.studentupdate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public List<Student> getAll(){
        return studentService.getAll();
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

package com.cjss.employeeupdate.controller;

import com.cjss.employeeupdate.EmployeeModel.Employee;
import com.cjss.employeeupdate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/task1")
    List<Employee> task1(){ return employeeService.task1();};

    @GetMapping("/task2")
    List<Employee> task2(){ return employeeService.task2();};

    @GetMapping("/task3")
    List<Employee> task3(){ return employeeService.task3();};

    @GetMapping("/task4")
    List<Employee> task4(){ return employeeService.task4();};

}

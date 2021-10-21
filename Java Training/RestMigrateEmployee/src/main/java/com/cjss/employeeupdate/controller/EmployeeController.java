package com.cjss.employeeupdate.controller;

import com.cjss.employeeupdate.EmployeeModel.Employee;
import com.cjss.employeeupdate.service.EmployeeService;
import com.cjss.employeeupdate.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    TaskService taskService;


    @PostMapping("/add")
    public List<Employee> addEmployee(@RequestBody Employee emp){
        return employeeService.addEmployee(emp);
    }

    @GetMapping("/by-country")
    List<Employee> byCountry(@RequestParam String country){
        System.out.println("Contr: "+country);
        return taskService.byCountry(country);};

    @GetMapping("/either-of-cities")
    List<Employee> eitherOfCities(@RequestParam String city1, @RequestParam String city2){
        return taskService.eitherOfCities(city1, city2);};

    @GetMapping("/have-benefits")
    List<Employee> haveBenefits(){ return taskService.haveBenefits();};

    @GetMapping("/all-employees")
    List<Employee> allEmployees(){ return taskService.allEmployees();};

}

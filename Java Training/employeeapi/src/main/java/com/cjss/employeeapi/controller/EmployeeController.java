package com.cjss.employeeapi.controller;

import com.cjss.employeeapi.EmployeeModel.Employee;
import com.cjss.employeeapi.service.EmployeeService;
import com.cjss.employeeapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    TaskService taskService;


    @PostMapping("/add")
    public Employee addEmployee(@Valid @RequestBody Employee emp){
        return employeeService.addEmployee(emp);
    }

    @GetMapping("/by-country")
    List<Employee> byCountry(@RequestParam String country){
        return taskService.byCountry(country);};

    @GetMapping("/either-of-cities")
    List<Employee> eitherOfCities(@RequestParam String city1, @RequestParam String city2){
        return taskService.eitherOfCities(city1, city2);};

    @GetMapping("/have-benefits")
    List<Employee> haveBenefits(){ return taskService.haveBenefits();};

    @GetMapping("/all-employees")
    List<Employee> allEmployees(){ return taskService.allEmployees();};

}

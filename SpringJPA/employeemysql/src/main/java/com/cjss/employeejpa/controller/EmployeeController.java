package com.cjss.employeejpa.controller;

import com.cjss.employeejpa.EmployeeModel.Employee;
import com.cjss.employeejpa.entity.EmployeeEntity;
import com.cjss.employeejpa.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
//    @Autowired
//    TaskService taskService;


    @PostMapping("/add")
    public EmployeeEntity addEmployee(@Valid @RequestBody Employee emp){
        return employeeService.addEmployee(emp);
    }

    @GetMapping("/getall")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("/get-id")
    public Employee getById(@RequestParam Long id){
        return employeeService.getById(id);
    }

    @DeleteMapping ("/delete-id")
    public void deleteById(@RequestParam Long id){
        employeeService.deleteById(id);
    }

/*
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


 */

}

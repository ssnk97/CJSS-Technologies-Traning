package com.cjss.employeespring.controller;

import com.cjss.employeespring.model.EmployeeModel;
import com.cjss.employeespring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    EmployeeModel addEmployee(@RequestBody EmployeeModel employeeModel) {
        return employeeService.addEmployee(employeeModel);
    }

    @GetMapping("/getall")
    List<EmployeeModel> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/get/{id}")
    EmployeeModel getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("/delete")
    EmployeeModel delete(@RequestHeader Integer data){
        return employeeService.delete(data);
    }
}



package com.cjss.employeeapi.service;

import com.cjss.employeeapi.EmployeeModel.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees ;

    public Employee addEmployee(Employee emp){
        if(employees == null){
            employees = new ArrayList<>();
        }
        employees.add(emp);
        Tables.setEmployees(employees);
        return emp;
    }

}

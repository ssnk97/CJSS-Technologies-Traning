package com.cjss.employeeupdate.service;

import com.cjss.employeeupdate.EmployeeModel.*;
import com.cjss.employeeupdate.HardCode.HardCoded;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private List<Employee> employees ;

    public List<Employee> addEmployee(Employee emp){
        if(employees == null){
            employees = new ArrayList<>();
        }
        employees.add(emp);
        Tables.setEmployees(employees);
        return employees;
    }

}

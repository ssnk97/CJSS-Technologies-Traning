package com.cjss.employeespring.service;

import com.cjss.employeespring.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService {
    private List<EmployeeModel> employees;

    public EmployeeModel addEmployee(EmployeeModel employeeModel){
        if(employees == null){
            employees = new ArrayList<>();
        }
        employees.add(employeeModel);
        return employeeModel;
    }
    public List<EmployeeModel> getEmployees(){
        return employees;
    }

    public EmployeeModel getEmployee(Integer id){
       Optional <EmployeeModel> optional = employees.stream().filter(x-> x.getId()==id).findFirst();
       return optional.isPresent()? optional.get() : null;
    }

    public EmployeeModel delete(Integer id){
        Optional <EmployeeModel> optional = employees.stream().filter(x-> x.getId()==id).findFirst();
        optional.ifPresent(employeeModel -> employees.remove(employeeModel));
        return optional.get();
    }





}
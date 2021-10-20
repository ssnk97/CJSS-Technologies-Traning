package com.cjss.employeespring.service;

import com.cjss.employeespring.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public EmployeeModel update(Integer id, Integer phone){
       // System.out.println("patch2");
        Optional <EmployeeModel> emp = employees.stream().filter(x-> x.getId()==id).findFirst();
        emp.get().setPhone(phone);
        return emp.get();
    }
    public List<EmployeeModel>  orderBySalary(){
        Collections.sort(employees);
        return employees;
    }
   /* public List<EmployeeModel>  orderByExperience(){
        Collections.sort(employees);
        return employees;
    }*/

    public List<EmployeeModel> salaryGreaterThan(Integer salary){
        List<EmployeeModel> emp = employees.stream().filter(x-> x.getSalary()>=salary).collect(Collectors.toList());
        return emp;
    }


}

package com.cjss.employeespring.service;

import com.cjss.employeespring.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.*;
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
        employees.sort(Comparator.comparing(EmployeeModel::getSalary));
        //Collections.sort(employees);
        return employees;
    }
    public List<EmployeeModel>  orderByExperience(){
       // Collections.sort(employees, new EmployeeModel.ExperienceComparator());
        //return employees;
        employees.sort(Comparator.comparing(EmployeeModel::getExperience));
        Collections.reverse(employees);
    return employees;
    }
    public List<EmployeeModel> salaryGreaterThan(Integer salary){
        List<EmployeeModel> emp = employees.stream().filter(x-> x.getSalary()>=salary).collect(Collectors.toList());
        return emp;
    }

    public List<EmployeeModel> experienceGreaterThan(Integer experience){
        System.out.println(experience);
        List<EmployeeModel> emp = employees.stream().filter(x-> x.getExperience()>=experience).collect(Collectors.toList());
        System.out.println(emp);
        return emp;
    }


}

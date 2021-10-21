package com.cjss.employeeupdate.service;

import com.cjss.employeeupdate.EmployeeModel.Employee;
import com.cjss.employeeupdate.EmployeeModel.Tables;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    public List<Employee> byCountry(String country){
        System.out.println(country);
        System.out.println("\n=====Retrieve all employees by country=====");
        List<Employee> ls = new ArrayList<>();
        Tables.getLocationsTable().stream().
                filter(s->s.getLocationCountry().equals(country)).
                forEach(list -> {
                    Tables.getEmployees().stream().
                            filter(e-> e.getLocationId().equals(list.getLocationId())).
                            forEach(emp -> {
                                ls.add(emp);
                                System.out.println("EmpName: " + emp.getEmployeeName());
                            });
                });

        return ls;
    }

    public List<Employee> eitherOfCities(String city1, String city2){
        List<Employee> ls = new ArrayList<>();
        System.out.println("\n=====Retrieve employees who are in city1  or city2=====");
        Tables.getLocationsTable().stream().filter(x-> x.getLocationName().equals(city1)|| x.getLocationName().equals(city2))
                .forEach(y->{
                    Tables.getEmployees().stream().filter(z-> z.getLocationId().equals(y.getLocationId())).forEach(emp-> ls.add(emp));
                } );

    return ls;
    }

    public List<Employee> haveBenefits(){
        System.out.println("\n======sRetrieve employees who have Benefits and display benefits details======");
        return Tables.getEmployees().stream().filter(x-> x.getBenefitsId()!=null).collect(Collectors.toList());
    }

    public List<Employee> allEmployees(){
        System.out.println("\n======Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry======");
        return Tables.getEmployees();
    }
}

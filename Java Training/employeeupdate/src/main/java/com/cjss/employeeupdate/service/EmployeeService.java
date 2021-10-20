package com.cjss.employeeupdate.service;

import com.cjss.employeeupdate.EmployeeModel.Employee;
import com.cjss.employeeupdate.HardCode.HardCoded;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    HardCoded hc = new HardCoded();

    public List<Employee> task1(){
        System.out.println("\n=====Retrieve all employees in India=====");
        List<Employee> ls = new ArrayList<>();
        hc.getLocationsTable().stream().
                filter(s->s.getLocationCountry().equals("India")).
                forEach(list -> {
                    hc.getEmployees().stream().
                            filter(e-> e.getLocation().getLocationId().equals(list.getLocationId())).
                            forEach(emp -> {
                                ls.add(emp);
                                System.out.println("EmpName: " + emp.getEmployeeName());
                            });
                });
        return ls;
    }

    public List<Employee> task2(){
        System.out.println("\n=====Retrieve employees who are in Chennai or Hyderabad=====");
        return hc.getEmployees().stream().
                filter(e-> e.getLocation().getLocationName().equals("Hyderabad") || e.getLocation().getLocationName().equals("Chennai"))
                .collect(Collectors.toList());
//                forEach(emp ->
//                        System.out.println("EmpName: "+ emp.getEmployeeName())
//                );
    }

    public List<Employee> task3(){
        List<Employee> ls = new ArrayList<>();
        System.out.println("\n======sRetrieve employees who have Benefits and display benefits details======");
        hc.getEmployees().forEach(x->
                x.getBenefitsList().stream().filter(y-> y.getBenefitId()!=null).forEach(z->{
                    if(!ls.contains(x)){
                        ls.add(x);
                    }
                }));
   return ls;
    }

    public List<Employee> task4(){
        System.out.println("\n======Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry======");
        return hc.getEmployees();
    }
}

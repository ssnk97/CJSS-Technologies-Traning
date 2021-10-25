package com.cjss.employeeapi.utilities;

import com.cjss.employeeapi.EmployeeModel.*;

import java.util.Arrays;
import java.util.List;

public class InitData {
    public static void initDetails(){

        Department dept1 = new Department("d101", "healthcare");
        Department dept2 = new Department("d201", "finance");
        Department dept3 = new Department("d301", "admin");
        Department dept4 = new Department("d401", "fraud");
        List<Department> departmentsTable = Arrays.asList(dept1, dept2, dept3, dept4);

        Location loc1 = new Location("hyd", "Hyderabad", "India");
        Location loc2 = new Location("chn", "Chennai", "India");
        Location loc3 = new Location("Lon", "London", "United Kingdom");
        List<Location> locationsTable = Arrays.asList(loc1, loc2,loc3);
        // locationsTable.forEach(value -> System.out.println(value.getLocationCountry()));

        Benefits ben1 = new Benefits("ben1", "Health Insurance", "Health Insurance is provided for you and your family");
        Benefits ben2 = new Benefits("ben2", "Stakes", "Stack is provided provided of your salary");
        Benefits ben3 = new Benefits("ben3", "Provident Fund", "Useful after retierment");
        List<Benefits> benefitsTable = Arrays.asList(ben1, ben2, ben3);

        List<String> emp1BenIds = Arrays.asList("ben1", "ben2");
        Employee emp1 = new Employee("Emp1", "Apple", "500000","hyd","d101", emp1BenIds, "emp1@cjsstechnologies.com");

        List<String> emp2BenIds = Arrays.asList("ben2", "ben3");
        Employee emp2 = new Employee("Emp2", "Mango", "800000","chn","d401", emp2BenIds, "emp2@cjsstechnologies.com");


        Employee emp3 = new Employee("Emp3", "Grape", "800000","lon","d301", null, "emp3@cjsstechnologies.com");

        List<Employee> employees = Arrays.asList(emp1,emp2,emp3);

        Tables.setDepartmentsTable(departmentsTable);
        Tables.setLocationsTable(locationsTable);
        Tables.setBenefitsTable(benefitsTable);
        Tables.setEmployees(employees);
        //System.out.println("INIT: "+ Tables.getDepartmentsTable());
    }
}

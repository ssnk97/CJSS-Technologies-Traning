package com.cjss.employeeupdate.HardCode;

import com.cjss.employeeupdate.EmployeeModel.Benefits;
import com.cjss.employeeupdate.EmployeeModel.Department;
import com.cjss.employeeupdate.EmployeeModel.Employee;
import com.cjss.employeeupdate.EmployeeModel.Location;

import java.util.Arrays;
import java.util.List;

public class HardCoded {

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

    Benefits ben4 = new Benefits(null, "No Benefits", "No Benefits");
    Benefits ben1 = new Benefits("ben1", "Health Insurance", "Health Insurance is provided for you and your family");
    Benefits ben2 = new Benefits("ben2", "Stakes", "Stack is provided provided of your salary");
    Benefits ben3 = new Benefits("ben3", "Provident Fund", "Useful after retierment");
    List<Benefits> benefitsTable = Arrays.asList(ben1, ben2, ben3, ben4);

    List<Benefits> emp1benefities = Arrays.asList(ben1, ben2);
    Employee emp1 = new Employee("Emp1", "Apple", "500000",loc1,dept1, emp1benefities);

    List<Benefits> emp2benefities = Arrays.asList(ben2, ben3);
    Employee emp2 = new Employee("Emp2", "Mango", "800000",loc2,dept4, emp2benefities);


    List<Benefits> emp3benefities = Arrays.asList(ben4);
    Employee emp3 = new Employee("Emp3", "Grape", "800000",loc3,dept3, emp3benefities );

    List<Employee> employees = Arrays.asList(emp1,emp2,emp3);


    public List<Benefits> getBenefitsTable() {
        return benefitsTable;
    }

    public List<Location> getLocationsTable() {
        return locationsTable;
    }

    public List<Department> getDepartmentsTable() {
        return departmentsTable;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

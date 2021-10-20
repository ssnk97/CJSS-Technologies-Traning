package com.cjss.employeeupdate.EmployeeModel;

import java.util.List;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String Salary;
    private Location location;
    private Department department;
    private List<Benefits> benefitsList;   // (one employee can have multiple benefits)


    public Employee(String employeeId, String employeeName, String salary, Location location, Department department, List<Benefits> benefitsList) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        Salary = salary;
        this.location = location;
        this.department = department;
        this.benefitsList = benefitsList;

    }

   /* public Employee(String employeeId, String employeeName, String salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        Salary = salary;
    }*/

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getSalary() {
        return Salary;
    }

    public Location getLocation() {
        return location;
    }
    public Department getDepartment() {
        return department;
    }

    public List<Benefits> getBenefitsList() {
        return benefitsList;
    }

//    public void setBenefitsList(List<Benefits> benefitsList) {
//        this.benefitsList = benefitsList;
//    }
}

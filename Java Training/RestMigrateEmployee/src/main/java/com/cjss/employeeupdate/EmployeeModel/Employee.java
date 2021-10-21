package com.cjss.employeeupdate.EmployeeModel;

import java.util.List;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String Salary;
    private String locationId;
    private String deptId;
    private List<String> benefitsId;   // (one employee can have multiple benefits)

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public List<String> getBenefitsId() {
        return benefitsId;
    }

    public void setBenefitsId(List<String> benefitsId) {
        this.benefitsId = benefitsId;
    }
}

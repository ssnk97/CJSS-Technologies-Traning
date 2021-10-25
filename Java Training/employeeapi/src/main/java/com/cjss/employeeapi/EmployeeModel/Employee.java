package com.cjss.employeeapi.EmployeeModel;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

public class Employee {
    @Pattern(regexp="^[a-zA-Z0-9]+$",message="ONLY ALPHABETS or NUMBERS ALLOWED FOR EMPLOYEEID")
    @NotNull(message = "ID should not be null")
    @NotEmpty(message = "ID Cant be Empty")
    private String employeeId;

    @Pattern(regexp="^[a-zA-z]+([\\s][a-zA-Z]+)*$",message="ONLY ALPHABETS ALLOWED FOR EMPLOYEE NAME :: or :: ONLY ONE SPACE BETWEEN 2 NAMES")
    @NotNull(message = "Name should not be null")
    private String employeeName;

    @Pattern(regexp="^((\\d+\\.)?\\d+)$",message="Enter salary interms of number/float")
    private String Salary;

    @Pattern(regexp="^[a-zA-Z]{3}",message="only 3 Aplphabetic characters")
    private String locationId;

    @Pattern(regexp="^[a-zA-Z0-9]+$",message="ONLY AlphaNumeric for deptId")
    @NotNull(message = "dept ID should not be null")
    @NotEmpty(message = "dept ID Cant be Empty")
    private String deptId;

    private List<String> benefitsId;   // (one employee can have multiple benefits)

    @Email(message = "enter a valid email")
    private String emailId;



    public Employee( String employeeId, String employeeName, String salary, String locationId, String deptId, List<String> benefitsId, String  emailId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        Salary = salary;
        this.locationId = locationId;
        this.deptId = deptId;
        this.benefitsId = benefitsId;
        this.emailId = emailId;
    }

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
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}

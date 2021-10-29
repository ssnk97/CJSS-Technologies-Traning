package com.cjss.employeejpa.EmployeeModel;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

public class Employee {
    @Pattern(regexp="^[0-9]+$",message="ONLY NUMBERS ALLOWED FOR EMPLOYEEID")
    private String employeeId;

    @Pattern(regexp="^[a-zA-z]+([\\s][a-zA-Z]+)*$",message="ONLY ALPHABETS ALLOWED FOR EMPLOYEE NAME :: or :: ONLY ONE SPACE BETWEEN 2 NAMES")
    @NotNull(message = "Name should not be null")
    private String employeeName;

    @Pattern(regexp="^((\\d+\\.)?\\d+)$",message="Enter salary interms of number/float")
    private String Salary;

   private Location location;

   private Department dept;

    private List<Benefits> benefitsList;   // (one employee can have multiple benefits)

    @Email(message = "enter a valid email")
    private String emailId;


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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public List<Benefits> getBenefitsList() {
        return benefitsList;
    }

    public void setBenefitsList(List<Benefits> benefitsList) {
        this.benefitsList = benefitsList;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}

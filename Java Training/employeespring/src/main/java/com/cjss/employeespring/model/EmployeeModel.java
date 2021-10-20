package com.cjss.employeespring.model;

import java.util.Comparator;

public class EmployeeModel {
    private Integer id;
    private String empName;
    private Double salary;
    private String department;
    private Integer experience;
    private Integer phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

/*
    @Override
    public int compareTo(EmployeeModel o) {
        return this.salary.compareTo(o.salary);
    }

    public static class ExperienceComparator implements Comparator<EmployeeModel>  {
        public int compare(EmployeeModel c1, EmployeeModel c2)
        {
            return c1.getExperience().compareTo(c2.getExperience());
        }
    }*/
}

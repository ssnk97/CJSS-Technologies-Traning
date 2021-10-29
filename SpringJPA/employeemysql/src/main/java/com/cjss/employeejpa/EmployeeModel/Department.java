package com.cjss.employeejpa.EmployeeModel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Department {

    @Pattern(regexp="^[0-9]+$",message="ONLY NUMBERS ALLOWED FOR deptId")
    private String deptId;

    @Pattern(regexp="^[a-zA-z]+([\\s][a-zA-Z]+)*$",message="ONLY ALPHABETS ALLOWED FOR EMPLOYEE NAME :: or :: ONLY ONE SPACE BETWEEN 2 NAMES")
    private String deptName; //(healthcare, finance, admin, fraud)


    public Department(String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;

    }

    public Department() {

    }

    public String getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}


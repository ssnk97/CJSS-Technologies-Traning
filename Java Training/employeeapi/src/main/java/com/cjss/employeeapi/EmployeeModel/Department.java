package com.cjss.employeeapi.EmployeeModel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Department {

    @Pattern(regexp="^[a-zA-Z0-9]+$",message="ONLY ALPHABETS or NUMBERS ALLOWED FOR deptId")
    @NotNull(message = "deptId should not be null")
    @NotEmpty(message = "deptId Cant be Empty")
    private String deptId;

    @Pattern(regexp="^[a-zA-z]+([\\s][a-zA-Z]+)*$",message="ONLY ALPHABETS ALLOWED FOR EMPLOYEE NAME :: or :: ONLY ONE SPACE BETWEEN 2 NAMES")
    private String deptName; //(healthcare, finance, admin, fraud)


    public Department(String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;

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


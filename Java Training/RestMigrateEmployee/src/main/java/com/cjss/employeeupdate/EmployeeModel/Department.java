package com.cjss.employeeupdate.EmployeeModel;

public class Department {
    private String deptId;
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


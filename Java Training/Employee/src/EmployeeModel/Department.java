package EmployeeModel;

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
}


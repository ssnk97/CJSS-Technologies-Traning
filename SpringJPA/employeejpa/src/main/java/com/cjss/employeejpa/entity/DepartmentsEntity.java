package com.cjss.employeejpa.entity;

import javax.persistence.*;


@Entity
@Table(name="departments")
public class DepartmentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long deptId;
    @Column
    private String deptName;

    @OneToOne(mappedBy = "department", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private EmployeeEntity employees ;




    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}

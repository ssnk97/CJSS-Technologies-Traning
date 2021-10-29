package com.cjss.employeejpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeId;
    @Column
    private String employeeName;
    @Column
    private String Salary;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="dept_id", referencedColumnName = "deptId")
    private DepartmentsEntity department;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private LocationEntity locationEntity;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="loc_id", referencedColumnName = "locationId")
    private List<BenefitsEntity> benefitsEntityList ;



    @Column
    private String emailId;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
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

    public LocationEntity getLocationEntity() {
        return locationEntity;
    }

    public void setLocationEntity(LocationEntity locationEntity) {
        this.locationEntity = locationEntity;
    }

    public DepartmentsEntity getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentsEntity department) {
        this.department = department;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public List<BenefitsEntity> getBenefitsEntityList() {
        return benefitsEntityList;
    }

    public void setBenefitsEntityList(List<BenefitsEntity> benefitsEntityList) {
        this.benefitsEntityList = benefitsEntityList;
    }
}

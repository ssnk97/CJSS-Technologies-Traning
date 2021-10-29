package com.cjss.employeejpa.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Benefits")
public class BenefitsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long benefitId;

    @Column
    private String benefitName;
    @Column
    private String description;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy= "benefitsEntityList", cascade = CascadeType.ALL )
    private List<EmployeeEntity> employeeEntity;

    public Long getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(Long benefitId) {
        this.benefitId = benefitId;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<EmployeeEntity> getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(List<EmployeeEntity> employeeEntity) {
        this.employeeEntity = employeeEntity;
    }
}

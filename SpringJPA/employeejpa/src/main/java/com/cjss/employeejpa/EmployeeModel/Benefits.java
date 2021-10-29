package com.cjss.employeejpa.EmployeeModel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Benefits {

    @Pattern(regexp="^[0-9]+$",message="ONLY NUMBERS ALLOWED FOR BenefitsID")
    private String benefitId;
    @NotNull(message = "ID should not be null")
    @NotEmpty(message = "ID Cant be Empty")
    private String benefitName;
    @NotNull(message = "ID should not be null")
    @NotEmpty(message = "ID Cant be Empty")
    private String description;

    public Benefits(String benefitId, String benefitName, String description) {
        this.benefitId = benefitId;
        this.benefitName = benefitName;
        this.description = description;
    }

    public Benefits() {
        
    }

    public String getBenefitName() {
        return benefitName;
    }

    public String getDescription() {
        return description;
    }

    public String getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(String benefitId) {
        this.benefitId = benefitId;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.cjss.employeeapi.EmployeeModel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Benefits {

    @Pattern(regexp="^[a-zA-Z0-9]+$",message="ONLY ALPHABETS or NUMBERS ALLOWED FOR ID")
    @NotNull(message = "ID should not be null")
    @NotEmpty(message = "ID Cant be Empty")
    private String benefitId;
    private String benefitName;
    private String description;

    public Benefits(String benefitId, String benefitName, String description) {
        this.benefitId = benefitId;
        this.benefitName = benefitName;
        this.description = description;
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

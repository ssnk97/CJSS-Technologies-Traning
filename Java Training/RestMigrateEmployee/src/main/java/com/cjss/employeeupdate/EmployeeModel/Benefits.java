package com.cjss.employeeupdate.EmployeeModel;

public class Benefits {

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

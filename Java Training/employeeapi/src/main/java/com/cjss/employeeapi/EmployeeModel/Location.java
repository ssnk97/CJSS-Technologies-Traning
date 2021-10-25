package com.cjss.employeeapi.EmployeeModel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Location {

    @Pattern(regexp="^[a-zA-Z0-9]+$",message="ONLY AlphaNumeric for LocationId")
    @NotNull(message = "LocationId should not be null")
    @NotEmpty(message = "locationId Cant be Empty")
    private String locationId;

    private String locationName ; //(Hyderabad, chennai, London)
    private String locationCountry ; //(India, United Kingdom)

    public Location(String locationId, String locationName, String locationCountry) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.locationCountry = locationCountry;
    }

    public String getLocationId() {
        return locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }
}

package com.cjss.employeejpa.EmployeeModel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Location {

    @Pattern(regexp="^[0-9]+$",message="ONLY Numeric for LocationId")
    private String locationId;

    @NotNull(message = "LocationName should not be null")
    @NotEmpty(message = "locationName Cant be Empty")
    private String locationName ; //(Hyderabad, chennai, London)
    @NotNull(message = "LocationCountry should not be null")
    @NotEmpty(message = "locationCountry Cant be Empty")
    private String locationCountry ; //(India, United Kingdom)

    public Location(String locationId, String locationName, String locationCountry) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.locationCountry = locationCountry;
    }

    public Location() {

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

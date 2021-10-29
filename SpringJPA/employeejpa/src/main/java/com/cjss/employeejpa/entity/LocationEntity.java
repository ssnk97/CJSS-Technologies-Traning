package com.cjss.employeejpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class LocationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long locationId;
    @Column
    private String locationName; //(Hyderabad, chennai, London)
    @Column
    private String locationCountry; //(India, United Kingdom)

    @OneToOne(mappedBy = "locationEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private EmployeeEntity employee;

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }
}
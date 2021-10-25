package com.cjss.employeeapi.service;

import com.cjss.employeeapi.EmployeeModel.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    private List<Department> departmentsTable;
    private List<Location> locationsTable;
    private List<Benefits> benefitsTable;

    public Department addDepartment(Department dept){
        if(departmentsTable == null){
            departmentsTable = new ArrayList<>();
        }
        departmentsTable.add(dept);
        Tables.setDepartmentsTable(departmentsTable);
        return dept;
    }

    public Location addLocation(Location loc){
        if(locationsTable == null){
            locationsTable = new ArrayList<>();
        }
        locationsTable.add(loc);
        Tables.setLocationsTable(locationsTable);
        return loc;
    }

    public Benefits addBenefits(Benefits ben){
        if(benefitsTable == null){
            benefitsTable = new ArrayList<>();
        }
        benefitsTable.add(ben);
        Tables.setBenefitsTable(benefitsTable);
        return ben;
    }

    public List<Department> allDept(){return Tables.getDepartmentsTable();}
    public List<Location> allLoc(){return Tables.getLocationsTable();}
    public List<Benefits> allBen(){return Tables.getBenefitsTable();}
    public List<Employee> allEmp(){return Tables.getEmployees();}

}

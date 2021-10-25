package com.cjss.employeeapi.controller;

import com.cjss.employeeapi.EmployeeModel.Benefits;
import com.cjss.employeeapi.EmployeeModel.Department;
import com.cjss.employeeapi.EmployeeModel.Employee;
import com.cjss.employeeapi.EmployeeModel.Location;
import com.cjss.employeeapi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/dept")
    public List<Department> allDept(){return adminService.allDept();}
    @GetMapping("/loc")
    public List<Location> allLoc(){return adminService.allLoc();}
    @GetMapping("/ben")
    public List<Benefits> allBen(){return adminService.allBen();}
    @GetMapping("/emp")
    public List<Employee> allEmp(){return adminService.allEmp();}

    @PostMapping("/add-dept")
    public Department addDepartment(@Valid @RequestBody Department dept){
        return adminService.addDepartment(dept);
    }

    @PostMapping("/add-loc")
    public Location addLocation(@Valid @RequestBody Location loc){
        return adminService.addLocation(loc);
    }

    @PostMapping("/add-ben")
    public Benefits addBenefits(@Valid @RequestBody Benefits ben){
        return adminService.addBenefits(ben);
    }
}

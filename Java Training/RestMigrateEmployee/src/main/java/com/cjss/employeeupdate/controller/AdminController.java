package com.cjss.employeeupdate.controller;

import com.cjss.employeeupdate.EmployeeModel.Benefits;
import com.cjss.employeeupdate.EmployeeModel.Department;
import com.cjss.employeeupdate.EmployeeModel.Employee;
import com.cjss.employeeupdate.EmployeeModel.Location;
import com.cjss.employeeupdate.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public Department addDepartment(@RequestBody Department dept){
        System.out.println(dept+ "ADD DEPT COntroller");
        return adminService.addDepartment(dept);
    }

    @PostMapping("/add-loc")
    public Location addLocation(@RequestBody Location loc){
        return adminService.addLocation(loc);
    }

    @PostMapping("/add-ben")
    public Benefits addBenefits(@RequestBody Benefits ben){
        return adminService.addBenefits(ben);
    }
}

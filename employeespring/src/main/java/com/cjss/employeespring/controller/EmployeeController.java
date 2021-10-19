package com.cjss.employeespring.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.cjss.employeespring.model.EmployeeModel;
import com.cjss.employeespring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    EmployeeModel addEmployee(@RequestBody EmployeeModel employeeModel) {
        return employeeService.addEmployee(employeeModel);
    }

    @GetMapping("/getall")
    List<EmployeeModel> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/get/{id}")
    EmployeeModel getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("/delete")
    EmployeeModel delete(@RequestHeader Integer data){
        return employeeService.delete(data);
    }

    @PatchMapping("/patch")
    EmployeeModel update(@RequestParam Integer id, @RequestParam Integer phone) {
        System.out.println("patch1");
        return employeeService.update(id, phone);
    }
}




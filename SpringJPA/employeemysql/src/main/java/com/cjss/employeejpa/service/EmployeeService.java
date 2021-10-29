package com.cjss.employeejpa.service;

import com.cjss.employeejpa.EmployeeModel.*;
import com.cjss.employeejpa.entity.BenefitsEntity;
import com.cjss.employeejpa.entity.DepartmentsEntity;
import com.cjss.employeejpa.entity.EmployeeEntity;
import com.cjss.employeejpa.entity.LocationEntity;
import com.cjss.employeejpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeEntity addEmployee(Employee emp){
        System.out.println(emp.getDept().getDeptName());

        DepartmentsEntity departmentsEntity = new DepartmentsEntity();
        departmentsEntity.setDeptName(emp.getDept().getDeptName());

        LocationEntity locationEntity = new LocationEntity();
        locationEntity.setLocationName(emp.getLocation().getLocationName());
        locationEntity.setLocationCountry(emp.getLocation().getLocationCountry());

        List<BenefitsEntity> benefitsEntityList = new ArrayList<>();
        emp.getBenefitsList().forEach(x-> {
            BenefitsEntity benefitsEntity = new BenefitsEntity();
            benefitsEntity.setBenefitName(x.getBenefitName());
            benefitsEntity.setDescription(x.getDescription());
            benefitsEntityList.add(benefitsEntity);
        });

        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployeeName(emp.getEmployeeName());
        employeeEntity.setEmailId(emp.getEmailId());
        employeeEntity.setSalary(emp.getSalary());
        employeeEntity.setDepartment(departmentsEntity);
        employeeEntity.setLocationEntity(locationEntity);
        employeeEntity.setBenefitsEntityList(benefitsEntityList);

        return employeeRepository.save(employeeEntity);
    }

    public List<Employee> getAll(){
        return employeeRepository.findAll().stream()
                .map(employee-> convertToEmployeeModel(employee)).collect(Collectors.toList());
    }

    public Employee getById(Long id){
        Optional <EmployeeEntity> opt = employeeRepository.findById(id);
        if(opt.isPresent()){
            return convertToEmployeeModel(opt.get());
        }
        return null;
       // return employeeRepository.findById(id).orElse(null)
    }

    public void deleteById(Long id){
        employeeRepository.deleteById(id);
    }

    public Employee convertToEmployeeModel(EmployeeEntity employeeEntity){
        Department dept = new Department();
        dept.setDeptName(employeeEntity.getDepartment().getDeptName());

        Location loc = new Location();
        loc.setLocationName(employeeEntity.getLocationEntity().getLocationName());
        loc.setLocationCountry(employeeEntity.getLocationEntity().getLocationCountry());

        List<Benefits> ben = new ArrayList<>();
        employeeEntity.getBenefitsEntityList().forEach(x-> {
            Benefits benefit = new Benefits();
            benefit.setBenefitName(x.getBenefitName());
            benefit.setDescription(x.getDescription());
            ben.add(benefit);
        });

        Employee emp = new Employee();
        emp.setEmployeeName(employeeEntity.getEmployeeName());
        emp.setEmailId(employeeEntity.getEmailId());
        emp.setSalary(employeeEntity.getSalary());
        emp.setDept(dept);
        emp.setLocation(loc);
        emp.setBenefitsList(ben);

        return emp;
    }

}

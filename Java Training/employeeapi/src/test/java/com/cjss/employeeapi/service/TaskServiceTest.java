package com.cjss.employeeapi.service;

import com.cjss.employeeapi.EmployeeModel.Employee;
import com.cjss.employeeapi.EmployeeModel.Tables;
import com.cjss.employeeapi.utilities.InitData;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TaskServiceTest {

    @InjectMocks
    TaskService taskService;

    @BeforeClass
    public static void start(){
        InitData.initDetails();}

    @Test
    public void byCountry() {
        List<Employee>  emp = taskService.byCountry("India");

        for (Employee ls : emp ) {

            switch(ls.getLocationId()){
                case "hyd":
                    assertEquals("hyd", ls.getLocationId());
                    break;
                case "chn":
                    assertEquals("chn", ls.getLocationId());
                    break;
            }
        }
    }

    @Test
    public void eitherOfCities() {
        String city1 = "Hyderabad";
        String city2 = "London";
        List<Employee> emp  = taskService.eitherOfCities(city1, city2);
        for (Employee ls : emp ) {
         String actualCity =  Tables.getLocationsTable().stream()
                 .filter(x-> ls.getLocationId().equals(x.getLocationId())).findFirst().get().getLocationName();

            switch(ls.getLocationId()){
                case "hyd":
                    assertEquals("Hyderabad", actualCity);
                    break;
                case "chn":
                    assertEquals("Chennai", ls.getLocationId());
                    break;
                case "lon":
                    assertEquals("London", actualCity);
            }
        }

    }

    @Test
    public void haveBenefits() {
        List <Employee> emp = taskService.haveBenefits();
        assertEquals(2, emp.size());

        emp.forEach(x-> {
            assertNotEquals(null, x.getBenefitsId());
            });
        }


    @Test
    public void allEmployees() {
        List<Employee> emp = taskService.allEmployees();
        assertEquals(3, emp.size());
    }
}
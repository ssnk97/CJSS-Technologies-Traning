package com.cjss.employeeapi.controller;


import com.cjss.employeeapi.service.EmployeeService;
import com.cjss.employeeapi.service.TaskService;
import com.cjss.employeeapi.utilities.InitData;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {
    @Mock
    EmployeeService employeeService;
    @Mock
    TaskService taskService;

    @InjectMocks
    EmployeeController employeeController;

    @BeforeClass
    public static void start(){
        InitData.initDetails();}


   @Test
    public void byCountry() {
       // when(taskService.byCountry("India")).thenReturn(Tables.getDepartmentsTable());
        assertEquals(employeeController.byCountry("India"), taskService.byCountry("India"));
       verify(taskService,times(2)).byCountry(anyString());
    }

    @Test
    public void eitherOfCities() {
        assertEquals(employeeController.eitherOfCities(anyString(), anyString() ),
                taskService.eitherOfCities(anyString(), anyString()));
        verify(taskService,times(2)).eitherOfCities(anyString(), anyString() );
    }

    @Test
    public void haveBenefits() {
        assertEquals(employeeController.haveBenefits(), taskService.haveBenefits());
        verify(taskService,times(2)).haveBenefits();
    }

    @Test
    public void allEmployees() {
        assertEquals(employeeController.allEmployees(), taskService.allEmployees());
        verify(taskService,times(2)).allEmployees();
    }
}
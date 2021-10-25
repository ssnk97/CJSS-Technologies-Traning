package com.cjss.employeeapi.controller;

import com.cjss.employeeapi.EmployeeModel.*;
import com.cjss.employeeapi.service.AdminService;
import com.cjss.employeeapi.utilities.InitData;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AdminControllerTest {

    @BeforeClass
    public static void start(){InitData.initDetails();}

    @Mock
    AdminService adminService;

    @InjectMocks
    AdminController adminController;


    @Test
    public void allDept() {
        when(adminService.allDept()).thenReturn(Tables.getDepartmentsTable());
        assertEquals(adminController.allDept(), adminService.allDept());
        verify(adminService, times(2)).allDept();

    }
    @Test
    public void allLoc() {
        when(adminService.allLoc()).thenReturn(Tables.getLocationsTable());
        assertEquals(adminController.allLoc(), adminService.allLoc());
        verify(adminService, times(2)).allLoc();
    }

    @Test
    public void allBen() {
        when(adminService.allBen()).thenReturn(Tables.getBenefitsTable());
        assertEquals(adminController.allBen(), adminService.allBen());
    }

    @Test
    public void allEmp() {
        when(adminService.allEmp()).thenReturn(Tables.getEmployees());
        assertEquals(adminController.allEmp(), adminService.allEmp());
    }

}
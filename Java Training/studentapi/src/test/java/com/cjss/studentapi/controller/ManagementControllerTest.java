package com.cjss.studentapi.controller;
import com.cjss.studentapi.Tables.Tables;
import com.cjss.studentapi.service.ManagementService;
import com.cjss.studentapi.utilities.InitData;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class ManagementControllerTest {

    @Mock
    ManagementService managementService;

    @InjectMocks
    ManagementController managementController;

    @BeforeClass
    public static void start(){InitData.initDetais();}

    @Test
    public void getStudentsTable() {
        when(managementService.getStudentsTable()).thenReturn(Tables.getStudents());
        assertEquals(managementController.getStudentsTable(), managementService.getStudentsTable());
        verify(managementService, times(2)).getStudentsTable();
    }

    @Test
    public void getStudentsFeeTable() {
        when(managementService.getStudentsFeeTable()).thenReturn(Tables.getStudentsFee());
        assertEquals(managementController.getStudentsFeeTable(), managementService.getStudentsFeeTable());
        verify(managementService, times(2)).getStudentsFeeTable();
    }

    @Test
    public void getMarksTable() {
        when(managementService.getMarksTable()).thenReturn(Tables.getMarks());
        assertEquals(managementController.getMarksTable(), managementService.getMarksTable());
        verify(managementService, times(2)).getMarksTable();
    }

    @Test
    public void getSubjectsTable() {
        when(managementService.getSubjectsTable()).thenReturn(Tables.getSubjects());
        assertEquals(managementController.getSubjectsTable(), managementService.getSubjectsTable());
        verify(managementService, times(2)).getSubjectsTable();
    }
}
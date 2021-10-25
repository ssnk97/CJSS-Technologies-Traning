package com.cjss.studentapi.controller;


import com.cjss.studentapi.Tables.Tables;
import com.cjss.studentapi.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class StudentControllerTest {
    @Mock
    StudentService studentService;
    @InjectMocks
    StudentController studentController;

    @Test
    public void task1() {

        assertEquals(studentController.task1(), studentService.task1());
        verify(studentService, times(2)).task1();
    }

    @Test
    public void task2() {
        assertEquals(studentController.task2(), studentService.task2());
        verify(studentService, times(2)).task2();
    }

    @Test
    public void task3() {
        assertEquals(studentController.task3(), studentService.task3());
        verify(studentService, times(2)).task3();
    }

    @Test
    public void task4() {
        assertEquals(studentController.task4(), studentService.task4());
        verify(studentService, times(2)).task4();
    }
}
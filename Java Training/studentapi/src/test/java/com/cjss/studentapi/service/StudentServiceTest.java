package com.cjss.studentapi.service;


import com.cjss.studentapi.Tables.Tables;
import com.cjss.studentapi.model.Student;
import com.cjss.studentapi.utilities.InitData;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {
@InjectMocks
StudentService studentService;

    @BeforeClass
    public static void start(){
        InitData.initDetais();}


    @Test
    public void task1() {
        List<Student> studActual = studentService.task1();
        List<Student> studExpected =      Tables.getStudents().stream()
                .filter(x-> x.getYear().equals("1")).collect(Collectors.toList());
        assertEquals(studExpected, studActual);

        studActual.forEach(x-> {
            switch(x.getRollno()){
                case "r101":
                    assertEquals("r101", x.getRollno());
                    assertEquals("1", x.getYear());
                    break;
                case "r401":
                    assertEquals("r401", x.getRollno());
                    assertEquals("1", x.getYear());
                    break;
            }
        });
    }

    @Test
    public void task2() {
    }

    @Test
    public void task3() {
    }

    @Test
    public void task4() {
    }
}
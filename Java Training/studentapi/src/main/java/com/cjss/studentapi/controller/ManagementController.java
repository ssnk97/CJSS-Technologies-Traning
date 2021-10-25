package com.cjss.studentapi.controller;

import com.cjss.studentapi.service.ManagementService;
import com.cjss.studentapi.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/management")
public class ManagementController {

    @Autowired
    ManagementService managementService;

    @PostMapping("/add-fee")
    public StudentFee addStudFee( @Valid @RequestBody StudentFee studentFee){
        return managementService.addStudFee(studentFee);
    }

    @PostMapping("/add-marks")
    public SubjectMarks addSubMarks(@Valid @RequestBody  SubjectMarks subjectMarks){
        return managementService.addSubMarks(subjectMarks);
    }

    @PostMapping("/add-sub")
    public Subjects addSubject(@Valid @RequestBody Subjects sub){
        return managementService.addSubject(sub);
    }

    @GetMapping ("student-table")
    public List<Student> getStudentsTable(){
        return managementService.getStudentsTable();
    }

    @GetMapping("fee-table")
    public List<StudentFee> getStudentsFeeTable(){
        return managementService.getStudentsFeeTable();
    }

    @GetMapping("subject-marks-table")
    public List<SubjectMarks> getMarksTable(){
        return managementService.getMarksTable();
    }

    @GetMapping("subjects-table")
    public List<Subjects> getSubjectsTable(){
        return managementService.getSubjectsTable();
    }

}

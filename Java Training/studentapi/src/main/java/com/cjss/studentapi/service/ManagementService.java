package com.cjss.studentapi.service;


import com.cjss.studentapi.Tables.Tables;
import com.cjss.studentapi.model.Student;
import com.cjss.studentapi.model.StudentFee;
import com.cjss.studentapi.model.SubjectMarks;
import com.cjss.studentapi.model.Subjects;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManagementService {
    List<StudentFee> studentsFee;
    List<SubjectMarks> marks;
    List<Subjects> subjects;

    public StudentFee addStudFee(StudentFee studentFee){
        if(studentsFee==null){
            studentsFee = new ArrayList<>();
        }
        studentsFee.add(studentFee);
        Tables.setStudentsFee(studentsFee);
        return studentFee;
    }

    public SubjectMarks addSubMarks(SubjectMarks subjectMarks){
        if(marks == null){
            marks = new ArrayList<>();
        }
        marks.add(subjectMarks);
        Tables.setMarks(marks);
        return subjectMarks;
    }

    public Subjects addSubject(Subjects sub){
        if(subjects == null){
            subjects = new ArrayList<>();
        }
        subjects.add(sub);
        Tables.setSubjects(subjects);
        return sub;
    }

    public List<Student> getStudentsTable(){
        return Tables.getStudents();
    }

    public List<StudentFee> getStudentsFeeTable(){
        return Tables.getStudentsFee();
    }

    public List<SubjectMarks> getMarksTable(){
        return Tables.getMarks();
    }

    public List<Subjects> getSubjectsTable(){
        return Tables.getSubjects();
    }
}

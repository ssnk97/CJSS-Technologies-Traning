package com.cjss.studentapi.Tables;

import com.cjss.studentapi.model.Student;
import com.cjss.studentapi.model.StudentFee;
import com.cjss.studentapi.model.SubjectMarks;
import com.cjss.studentapi.model.Subjects;

import java.util.List;

public class Tables {
    public static List<Subjects> subjects;
    public static List <SubjectMarks> marks;
    public static List <StudentFee> studentsFee;
    public static List <Student> students;

    public static List<Subjects> getSubjects() {
        return subjects;
    }

    public static void setSubjects(List<Subjects> subjects) {
        Tables.subjects = subjects;
    }

    public static List<SubjectMarks> getMarks() {
        return marks;
    }

    public static void setMarks(List<SubjectMarks> marks) {
        Tables.marks = marks;
    }

    public static List<StudentFee> getStudentsFee() {
        return studentsFee;
    }

    public static void setStudentsFee(List<StudentFee> studentsFee) {
        Tables.studentsFee = studentsFee;
    }

    public static List<Student> getStudents() {
        return students;
    }

    public static void setStudents(List<Student> students) {
        Tables.students = students;
    }
}

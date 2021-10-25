package com.cjss.studentapi.utilities;

import com.cjss.studentapi.Tables.Tables;
import com.cjss.studentapi.model.*;

import java.util.Arrays;
import java.util.List;

public class InitData {

    public static void initDetais(){
        System.out.println("INITDETAILS");
        // TODO Auto-generated method stub
        Subjects sub1 = new Subjects("subno1", "subName1");
        Subjects sub2 = new Subjects("subno2", "subName2");
        Subjects sub3 = new Subjects("subno3", "subName3");
        Subjects sub4 = new Subjects("subno4", "subName4");
        Subjects sub5 = new Subjects("subno5", "subName5");
        Subjects sub6 = new Subjects("subno6", "subName6");
        List<Subjects> subjects = Arrays.asList(sub1,sub2,sub3,sub4,sub5,sub6);


        SubjectMarks mark1 = new SubjectMarks("r101","1","subno1" , 98f);
        SubjectMarks mark2 = new SubjectMarks("r101","1","subno2" , 75f);
        SubjectMarks mark3 = new SubjectMarks("r101","1","subno3" , 78f);
        SubjectMarks mark4 = new SubjectMarks("r201","2","subno4" , 86f);
        SubjectMarks mark5 = new SubjectMarks("r201","2","subno5" , 92f);
        SubjectMarks mark6 = new SubjectMarks("r201","2","subno6" , 85f);
        SubjectMarks mark7 = new SubjectMarks("r301","3","subno1" , 68f);
        SubjectMarks mark8 = new SubjectMarks("r401","1","subno3" , 65f);
        SubjectMarks mark9 = new SubjectMarks("r501","2","subno4" , 74f);
        List <SubjectMarks> marks = Arrays.asList(mark1, mark2, mark3, mark4, mark5, mark6,mark7,mark8, mark9);


        Student student1 = new Student("r101", "Name1","Branch1", "1");
        StudentFee stud1fee = new StudentFee("r101", 12000f, "Oct 12, 2021") ;

        Student student2 = new Student("r201", "Name2","Branch2", "2");
        StudentFee stud2fee = new StudentFee("r201", 13000f, "Apr 7, 2018") ;

        Student student3 = new Student("r301", "Name3","Branch2", "3");
        StudentFee stud3fee = new StudentFee("r301", 8000f, "Mar 7, 2020") ;

        Student student4 = new Student("r401", "Name4","Branch3", "1");
        StudentFee stud4fee = new StudentFee("r401", 13000f, "May 12, 2008") ;


        Student student5 = new Student("r501", "Name5","Branch1", "2");
        StudentFee stud5fee = new StudentFee("r501", 19000f, "Nov 1, 2015") ;


        List <StudentFee> studentsFee = Arrays.asList(stud1fee,stud2fee,stud3fee,stud4fee,stud5fee);
        List <Student> students = Arrays.asList(student1,student2, student3, student4, student5);

        Tables.setMarks(marks);
        Tables.setStudents(students);
        Tables.setSubjects(subjects);
        Tables.setStudentsFee(studentsFee);
        System.out.println(Tables.getSubjects());

    }
}

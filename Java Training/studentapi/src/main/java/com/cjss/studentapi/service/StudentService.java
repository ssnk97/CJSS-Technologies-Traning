package com.cjss.studentapi.service;

import com.cjss.studentapi.Tables.Tables;
import com.cjss.studentapi.model.*;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    //HardCode hc = new HardCode();
    List<Student> students ;

    public Student addStudent(Student student){
        if(students == null){
            students = new ArrayList<>();
        }
        students.add(student);
        Tables.setStudents(students);
        return student;
    }

    //		Task 1: Print student rno, name, branch of 1st year students
    public List<Student> task1(){
       // System.out.println("Task 1 Streams: Print student rno, name, branch of 1st year students");
        return Tables.getStudents().stream().filter(stud-> stud.getYear().equals("1")).collect(Collectors.toList());
    }

    //		 Task 2: Print all students rno, name, branch, amount, date
    public List<Student> task2(){
        List <Student> ls = new ArrayList<>();
        System.out.println("\n\nTask 2 Stream: Print all students rno, name, branch, amount, date");
            Tables.getStudents().forEach(stud->{
            Tables.getStudentsFee().stream().filter(studfee-> studfee.getRollNo().equals(stud.getRollno())).
                    forEach(data-> {
                            //System.out.println("RNO: "+stud.getRollno() +"   Name: "+stud.getName()+"   Branch: "+ stud.getBranch() +" amount: "+ data.getAmount()+ "  Date: " + data.getDate() ));
                        ls.add(stud);
                    });
            });
       return ls;
    }


    //		 Task 3: Print all students rno, name, subjectName, marks
    public List<Student> task3() {
        List<Student> ls = new ArrayList<>();
        System.out.println("\n\nTask 3 Streams: Print all students rno, name, subjectName, marks");
        Tables.getStudents().forEach(stud -> {
            Tables.getMarks().stream().filter(x -> x.getRollNo().equals(stud.getRollno())).
                    forEach(mark -> {
                        Tables.getSubjects().stream().filter(y -> mark.getSubjectNo().equals(y.getSubjectNo())).
                                forEach(sub -> {
                                    ls.add(stud);
                                });
                    });
        });
        return  ls;
    }

    //		 Task 4: Print all students rno, name, subjectName, marks order by year
    public List<Student> task4() {
        List<Student> ls = new ArrayList<>();
        //sorting the Students collection wrt year
        Tables.getStudents().sort(Comparator.comparing(Student::getYear));

        System.out.println("\n\nTask 4 Streams: Print all students rno, name, subjectName, marks in sorted by year");
        return Tables.getStudents();
    }

}//class

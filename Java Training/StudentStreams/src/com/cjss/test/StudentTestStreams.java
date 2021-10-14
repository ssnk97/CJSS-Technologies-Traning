package com.cjss.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cjss.model.Student;
import com.cjss.model.StudentFee;
import com.cjss.model.SubjectMarks;
import com.cjss.model.Subjects;

public class StudentTestStreams {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Subjects sub1 = new Subjects("subno1", "subName1");
        Subjects sub2 = new Subjects("subno2", "subName2");
        Subjects sub3 = new Subjects("subno3", "subName3");
        Subjects sub4 = new Subjects("subno4", "subName4");
        Subjects sub5 = new Subjects("subno5", "subName5");
        Subjects sub6 = new Subjects("subno6", "subName6");
        List <Subjects> subjects = new ArrayList();
        subjects.add(sub1);
        subjects.add(sub2);
        subjects.add(sub3);
        subjects.add(sub4);
        subjects.add(sub5);
        subjects.add(sub6);


        SubjectMarks mark1 = new SubjectMarks("r101","1","subno1" , 98f);
        SubjectMarks mark2 = new SubjectMarks("r101","1","subno2" , 75f);
        SubjectMarks mark3 = new SubjectMarks("r101","1","subno3" , 78f);
        SubjectMarks mark4 = new SubjectMarks("r201","2","subno4" , 86f);
        SubjectMarks mark5 = new SubjectMarks("r201","2","subno5" , 92f);
        SubjectMarks mark6 = new SubjectMarks("r201","2","subno6" , 85f);
        SubjectMarks mark7 = new SubjectMarks("r301","3","subno1" , 68f);
        SubjectMarks mark8 = new SubjectMarks("r401","1","subno3" , 65f);
        SubjectMarks mark9 = new SubjectMarks("r501","2","subno4" , 74f);


        List <SubjectMarks> marks = new ArrayList();
        marks.add(mark1);
        marks.add(mark2);
        marks.add(mark3);
        marks.add(mark4);
        marks.add(mark5);
        marks.add(mark6);
        marks.add(mark7);
        marks.add(mark8);
        marks.add(mark9);

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


        List <StudentFee> studentsFee = new ArrayList();
        studentsFee.add(stud1fee);
        studentsFee.add(stud2fee);
        studentsFee.add(stud3fee);
        studentsFee.add(stud4fee);
        studentsFee.add(stud5fee);


        List <Student> students = new ArrayList();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        //		Task 1: Print student rno, name, branch of 1st year students
        System.out.println("Task 1 Streams: Print student rno, name, branch of 1st year students");
        students.forEach(stud->{
            if(stud.getYear().equals("1")){
                System.out.println("RNO: "+stud.getRollno() +"   Name: "+stud.getName()+
                        "   Branch: "+ stud.getBranch());
            }
                }
                );



        //		 Task 2: Print all students rno, name, branch, amount, date
        System.out.println("\n\nTask 2 Stream: Print all students rno, name, branch, amount, date");
        students.forEach(stud->{
            studentsFee.stream().filter(studfee-> studfee.getRollNo().equals(stud.getRollno())).
                    forEach(data-> System.out.println("RNO: "+stud.getRollno() +"   Name: "+stud.getName()+
                            "   Branch: "+ stud.getBranch() +" amount: "+ data.getAmount()+
                            "  Date: " + data.getDate() ));
        });


        //		 Task 3: Print all students rno, name, subjectName, marks

        System.out.println("\n\nTask 3 Streams: Print all students rno, name, subjectName, marks");
        students.forEach(stud-> {
            marks.stream().filter(x-> x.getRollNo().equals(stud.getRollno())).
                    forEach(mark->{
                        subjects.stream().filter(y->mark.getSubjectNo().equals(y.getSubjectNo())).
                                forEach(sub->{
                                    System.out.println("RNO: "+stud.getRollno()+ "  Name: "+ stud.getName()+
                                            "  Branch: "+ stud.getBranch()+ "  SubjectsName: "+ sub.getSubjectName()+
                                            "  marks: "+ mark.getMarks());
                                });
                    });
        });

        //		 Task 4: Print all students rno, name, subjectName, marks order by year

        //sorting the Students collection wrt year
        Collections.sort(students);
      //  Collections.reverse(students);

        System.out.println("\n\nTask 4 Streams: Print all students rno, name, subjectName, marks in sorted by year");
        students.forEach(stud-> {
            marks.stream().filter(x-> x.getRollNo().equals(stud.getRollno())).
                    forEach(mark->{
                        subjects.stream().filter(y->mark.getSubjectNo().equals(y.getSubjectNo())).
                                forEach(sub->{
                                    System.out.println("RNO: "+stud.getRollno()+ "  Name: "+ stud.getName()+
                                            "  Branch: "+ stud.getBranch()+ "  Year: "+stud.getYear()+"  SubjectsName: "+ sub.getSubjectName()+
                                            "  marks: "+ mark.getMarks());
                                });
                    });
        });

    }

}

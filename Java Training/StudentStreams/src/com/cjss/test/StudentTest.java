package com.cjss.test;

import java.util.ArrayList;
import java.util.List;

import com.cjss.model.Student;
import com.cjss.model.StudentFee;
import com.cjss.model.SubjectMarks;
import com.cjss.model.Subjects;

public class StudentTest {

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
		System.out.println("Task 1: Print student rno, name, branch of 1st year students");

		for(Student stud : students)
		{
			if(stud.getYear().equals("1"))
			{
				//String rollNo = students.get(i).getRollno();
				System.out.println("RNO: "+stud.getRollno() +"   Name: "+stud.getName()+ 
						"   Branch: "+ stud.getBranch());
			}
		}



		//		 Task 2: Print all students rno, name, branch, amount, date

		System.out.println("\n\nTask 2: Print all students rno, name, branch, amount, date");
		for(Student stud : students)
		{
			String rollNo = stud.getRollno();
			System.out.print("RNO: "+stud.getRollno() +"   Name: "+stud.getName()+ 
					"   Branch: "+ stud.getBranch());
			for( StudentFee studfee : studentsFee)
			{
				if(studfee.getRollNo().equals(rollNo))
				{
					System.out.println(" amount: "+ studfee.getAmount()+ "  Date: " + studfee.getDate());
				}
			}

		}


		//		 Task 3: Print all students rno, name, subjectName, marks
		System.out.println("\n\nTask 3: Print all students rno, name, subjectName, marks");
		for(Student stud : students)
		{
			String rollNo = stud.getRollno();
			System.out.print("\n\nRNO: "+stud.getRollno() +"   Name: "+stud.getName()+ 
					"   Branch: "+ stud.getBranch());
			
			for(SubjectMarks submark : marks)
			{
				if(submark.getRollNo().equals(rollNo))
				{
					for(Subjects sub : subjects)
					{
						if(submark.getSubjectNo().equals(sub.getSubjectNo()))
						{
							System.out.print("\nSubjectName: "+ sub.getSubjectName()
									+ "   Marks: "+ submark.getMarks());
						}
					}
				}
			}

		}

		//		 Task 4: Print all students rno, name, subjectName, marks order by year
		
		//sorting the Students collection wrt year
		for(int i=0; i<students.size();i++)
			for(int j=0; j<students.size()-1; j++)
			{
				if(Integer.parseInt(students.get(i).getYear()) > Integer.parseInt(students.get(j).getYear()))
				{
					Student temp = students.get(i);
					students.set(i,students.get(j));
					students.set(j,temp);
				}
			}
		
		System.out.println("\n\nTask 4: Print all students rno, name, subjectName, marks in sorted by year");
		for(Student stud : students)
		{
			String rollNo = stud.getRollno();
			System.out.print("\n\nRNO: "+stud.getRollno() +"   Name: "+stud.getName()+ 
					"   Branch: "+ stud.getBranch());
			
			for(SubjectMarks submark : marks)
			{
				if(submark.getRollNo().equals(rollNo))
				{
					for(Subjects sub : subjects)
					{
						if(submark.getSubjectNo().equals(sub.getSubjectNo()))
						{
							System.out.print("\nSubjectName: "+ sub.getSubjectName()
									+ "   Marks: "+ submark.getMarks());
						}
					}
				}
			}

		}

	}

}

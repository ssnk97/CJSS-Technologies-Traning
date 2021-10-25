package com.cjss.studentapi.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Student implements Comparable<Student>{

	@Pattern(regexp="^[a-zA-Z0-9]+$",message="ONLY ALPHABETS or NUMBERS ALLOWED FOR rollNo")
	@NotNull(message = "rollNo should not be null")
	@NotEmpty(message = "rollNo Cant be Empty")
	private String rollno;

	@Pattern(regexp="^[a-zA-z]+([\\s][a-zA-Z]+)*$",message="ONLY ALPHABETS ALLOWED FOR EMPLOYEE NAME :: or :: ONLY ONE SPACE BETWEEN 2 NAMES")
	@NotNull(message = "name should not be null")
	@NotEmpty(message = "name Cant be Empty")
	private String name;

	@Pattern(regexp="^[a-zA-Z]+$",message="ONLY ALPHABETS  ALLOWED FOR branch")
	@NotNull(message = "branch should not be null")
	@NotEmpty(message = "branch Cant be Empty")
	private String branch;

	@Pattern(regexp="^[0-9]+$",message="only numbers")
	@NotNull(message = "year should not be null")
	@NotEmpty(message = "year Cant be Empty")
	private String year;
	
	
	public Student(String rollno, String name, String branch, String year) {
		this.rollno = rollno;
		this.name = name;
		this.branch = branch;
		this.year = year;
	}
	public String getRollno() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public String getYear() {
		return year;
	}

	@Override
	public int compareTo(Student stud) {
		return this.year.compareTo(stud.year);
	}
}

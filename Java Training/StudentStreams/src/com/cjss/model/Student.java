package com.cjss.model;

public class Student implements Comparable<Student>{
	private String rollno;
	private String name;
	private String branch;
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

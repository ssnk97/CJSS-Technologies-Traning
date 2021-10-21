package com.cjss.studentupdate.model;

public class SubjectMarks {
	private String rollNo;
	private String year;
	private String subjectNo;
	private float marks;
	public SubjectMarks(String rollNo, String year, String subjectNo, float marks) {
		super();
		this.rollNo = rollNo;
		this.year = year;
		this.subjectNo = subjectNo;
		this.marks = marks;
	}
	public String getRollNo() {
		return rollNo;
	}
	public String getYear() {
		return year;
	}
	public String getSubjectNo() {
		return subjectNo;
	}
	public float getMarks() {
		return marks;
	}
	
	
	
	
	

}

package com.cjss.studentapi.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class SubjectMarks {
	@Pattern(regexp="^[a-zA-Z0-9]+$",message="ONLY ALPHABETS or NUMBERS ALLOWED FOR rollNo")
	@NotNull(message = "rollNo should not be null")
	@NotEmpty(message = "rollNo Cant be Empty")
	private String rollNo;

	@Pattern(regexp="^[0-9]+$",message="only numbers")
	@NotNull(message = "year should not be null")
	@NotEmpty(message = "year Cant be Empty")
	private String year;

	@NotNull @NotEmpty
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

package com.cjss.studentapi.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Subjects {
	@Pattern(regexp="^[a-zA-Z0-9]+$",message="ONLY ALPHABETS or NUMBERS ALLOWED FOR subjectNo")
	@NotNull(message = "subjectNo should not be null")
	@NotEmpty(message = "subjectNo Cant be Empty")
	private String subjectNo;

	@NotNull(message = "subjectName should not be null")
	@NotEmpty(message = "subjectName Cant be Empty")
	private String subjectName;
	
	
	public Subjects(String subjectNo, String subjectName) {
		super();
		this.subjectNo = subjectNo;
		this.subjectName = subjectName;
	}
	public String getSubjectNo() {
		return subjectNo;
	}
	public String getSubjectName() {
		return subjectName;
	}
	
	
	
	

}

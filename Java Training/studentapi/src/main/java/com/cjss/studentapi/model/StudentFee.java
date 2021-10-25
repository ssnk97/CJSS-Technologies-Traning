package com.cjss.studentapi.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class StudentFee {
	@Pattern(regexp="^[a-zA-Z0-9]+$",message="ONLY ALPHABETS or NUMBERS ALLOWED FOR rollNo")
	@NotNull(message = "rollNo should not be null")
	@NotEmpty(message = "rollNo Cant be Empty")
	private String rollNo;


	private float amount;
	private String date;
	
	public StudentFee(String rollNo, float amount, String date) {
		super();
		this.rollNo = rollNo;
		this.amount = amount;
		this.date= date;
	}
	public String getRollNo() {
		return rollNo;
	}
	
	public float getAmount() {
		return amount;
	}
	public String getDate() {
		return date;
	}
	
}

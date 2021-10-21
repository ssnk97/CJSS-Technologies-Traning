package com.cjss.studentupdate.model;

public class StudentFee {
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

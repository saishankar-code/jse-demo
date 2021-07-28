package com.demo;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentGender;
	
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getStudentGender() {
		return studentGender;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentId, String studentName, String studentGender) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGender = studentGender;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentGender=" + studentGender
				+ "]";
	}
	
	
	

	
}

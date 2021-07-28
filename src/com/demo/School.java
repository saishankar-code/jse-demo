package com.demo;

public class School {
	
	private String schoolName;
	private String schoolAddress;
	private Student student;
	
	
	public String getSchoolName() {
		return schoolName;
	}


	public String getSchoolAddress() {
		return schoolAddress;
	}


	public Student getStudent() {
		return student;
	}


	public School(String schoolName, String schoolAddress, Student student) {
		super();
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.student = student;
	}


	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolAddress=" + schoolAddress + ", student=" + student + "]";
	}
	
	

}

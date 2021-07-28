package com.demo;

public class NSSStudent extends Student {
	
	private String welfareActivity;

	public NSSStudent(String welfareActivity, int studentId, String studentName, String studentGender) {
		super(studentId, studentName, studentGender);
		this.welfareActivity = welfareActivity;
	}

	@Override
	public String toString() {
		return "NSSStudent [welfareActivity=" + welfareActivity + "]";
	}
	
	
	
	

}

package com.demo;

public class RelationshipSchool {

	public static void main(String[] args) {
		
		Student student = new Student(1, "Sai", "Male");
		School school = new School("HPS", "BegumpetHyderabad", student);
		System.out.println(school);
		
		Student student1 = new NCCStudent("ParadeMarch", 1, "Sai", "Male");
		School school1 = new School("HPS", "BegumpetHyderabad", student1);
		System.out.println(school1);

		

		

	}

}

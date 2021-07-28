package com.demo;

public class HasARelationshipAthlete {

	public static void main(String[] args) {
		
		Qualities qualities = new Qualities(6, 60, "Hockey", "India");
		
		Athlete athlete = new Athlete(1, "Sai", qualities);
		
		System.out.println(athlete);
		

	}

}

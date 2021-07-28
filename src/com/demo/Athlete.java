package com.demo;

public class Athlete {
	private int id;
	private String name;
	private Qualities qualities;
	
	
	public Athlete(int id, String name, Qualities qualities) {
		super();
		this.id = id;
		this.name = name;
		this.qualities = qualities;
	}


	@Override
	public String toString() {
		return "Athlete [id=" + id + ", name=" + name + ", qualities=" + qualities + "]";
	}
	
	

}

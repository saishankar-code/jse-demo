package com.demo;

public class Qualities {
	
	private int height;
	private int weight;
	private String sport;
	private String country;
	
	public Qualities(int height, int weight, String sport, String country) {
		super();
		this.height = height;
		this.weight = weight;
		this.sport = sport;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Qualities [height=" + height + ", weight=" + weight + ", sport=" + sport + ", country=" + country + "]";
	}
	
	

}

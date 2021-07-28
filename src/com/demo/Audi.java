package com.demo;

public class Audi extends Car {
	
	private int audiId;
	private String audiName;
	
	
	public int getAudiId() {
		return audiId;
	}
	public String getAudiName() {
		return audiName;
	}
	
	
	public Audi(int audiId, String audiName, int carId, String carName) {
		super(carId,carName);
		this.audiId = audiId;
		this.audiName = audiName;
	}
	@Override
	public String toString() {
		return "Audi [audiId=" + audiId + ", audiName=" + audiName + "]";
	}
	
	
	

}

package com.demo;

public class Car {
	
	private int carId;
	private String carName;
	
	
	public int getCarId() {
		return carId;
	}
	public String getCarName() {
		return carName;
	}
	
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Car(int carId, String carName) {
		super();
		this.carId = carId;
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + "]";
	}
	
	
}

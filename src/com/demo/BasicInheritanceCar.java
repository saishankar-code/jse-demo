package com.demo;

public class BasicInheritanceCar {

	public static void main(String[] args) {
		Audi audi = new Audi(1, "audi", 1, "car");
		System.out.println(audi);
		
		System.out.println(audi.getCarId());
		System.out.println(audi.getCarName());
		
		Car car = new Audi(2,"audi1", 1, "car");
		System.out.println(car);
		
		System.out.println(car.getCarId());
		System.out.println(car.getCarName());

	}

}

package com.demo;

public class ShallowCloneFlower {

	public static void main(String[] args) {
		Flower flower = new Flower();
		
		flower.setFlowerId(1);
		flower.setFlowerName("lilly");
		flower.setFlowerDescription("smellsgood");
		flower.setFlowerType("white");
		
		Flower flower1 = flower;
		
		flower1.setStyle(100);
		
		System.out.println(flower);
		
		System.out.println(flower1);	
		

	}

}

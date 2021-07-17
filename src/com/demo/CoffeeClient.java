package com.demo;

public class CoffeeClient {

	public static void main(String[] args) {
		//BlackCoffee data
		Coffee blackData = new Coffee();
		blackData.setId(1);
		blackData.setName("BlackCoffee");
		blackData.setCost(25);
		blackData.setBehaviour("GoodForHealth");
		System.out.println(blackData.hashCode());
		System.out.println(blackData);
		
		//BlackCoffee1 data
		Coffee blackData1 = new Coffee();
		blackData1.setId(1);
		blackData1.setName("BlackCoffee");
		blackData1.setCost(25);
		blackData1.setBehaviour("GoodForHealth");
		System.out.println(blackData1.hashCode());
		System.out.println(blackData1);
		System.out.println(blackData.equals(blackData1));
		if(blackData.hashCode()==blackData1.hashCode() && blackData.equals(blackData1)) {
			System.out.println("data in both objects are same");
			}
			else {
				System.out.println("data in both objects are not same");

			}
		

		
		//Capaccino data
		Coffee capaccinoData = new Coffee();
		capaccinoData.setId(2);
		capaccinoData.setName("Capacino");
		capaccinoData.setCost(45);
		capaccinoData.setBehaviour("BadForHealth");
		System.out.println(capaccinoData.hashCode());
		System.out.println(capaccinoData);
		
		//cold coffee data
		Coffee coldData = new Coffee();
		coldData.setId(3);
		coldData.setName("ColdCoffee");
		coldData.setCost(145);
		coldData.setBehaviour("BadForHealth");
		System.out.println(coldData.hashCode());
		System.out.println(coldData);
		System.out.println(capaccinoData.equals(coldData));
		if(capaccinoData.hashCode()==blackData1.hashCode() && capaccinoData.equals(coldData)) {
			System.out.println("data in both objects are same");
			}
			else {
				System.out.println("data in both objects are not same");

			}

	}

}

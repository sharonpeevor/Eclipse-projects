package com.qa.solid.singleresponsibility;

public class Runner {

	public static void main(String[] args) {

		Car myCar = new Car("black", "A5", 5000);
		
		System.out.println(myCar.getMileage());
		
		Driver driver = new Driver();
		
		driver.drive(myCar, 500);
		
		System.out.println(myCar.getMileage());
		
		Mechanic mech = new Mechanic();
		
		mech.changeColour(myCar, "Blue");
		
		System.out.println(myCar.getColour());

	}

}

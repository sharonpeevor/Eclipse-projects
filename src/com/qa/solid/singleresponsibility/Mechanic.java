package com.qa.solid.singleresponsibility;

public class Mechanic {

	public void changeColour(Car car, String newColour) {
		car.setColour(newColour);
	}
}

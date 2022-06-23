package com.qa.inheritance;

public class Car extends Vehicle {

	private int doors;
	private boolean sunroof;
	
	public Car(String make, String colour, int wheels, double length, int doors, boolean sunroof) {
		super(make, colour, wheels, length);
		this.doors = doors;
		this.sunroof = sunroof;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public boolean isSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}

	@Override
	public void calculateBill() {
		System.out.println("The bill for the car is £50");
	}
	
	@Override
	public String toString() {
		return "Car [doors = " + doors + ", sunroof = " + sunroof + ", Make = " + getMake() + ", Colour = "
				+ getColour() + ", Wheels = " + getWheels() + ", Length = " + getLength() + "]";
	}
	
	
}

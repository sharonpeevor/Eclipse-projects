package com.qa.inheritance;

public class Motorbike extends Vehicle {

	private int gears;
	private int engineSize;
	
	public Motorbike(String make, String colour, int wheels, double length, int gears, int engineSize) {
		super(make, colour, wheels, length);
		this.gears = gears;
		this.engineSize = engineSize;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public int getengineSize() {
		return engineSize;
	}

	public void setengineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public void calculateBill() {
		System.out.println("The bill for the motorbike is £20");
	}
	
	@Override
	public String toString() {
		return "Motorbike [gears = " + gears + ", engineSize = " + engineSize + ", Make = " + getMake()
				+ ", Colour = " + getColour() + ", Wheels = " + getWheels() + ", Length = " + getLength()
				+ "]";
	}
	
	
}

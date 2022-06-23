package com.qa.inheritance;

public class Train extends Vehicle {

	private boolean toilets;
	private int windows;
	
	public Train(String make, String colour, int wheels, double length, boolean toilets, int windows) {
		super(make, colour, wheels, length);
		this.toilets = toilets;
		this.windows = windows;
	}

	public boolean isToilets() {
		return toilets;
	}

	public void setToilets(boolean toilets) {
		this.toilets = toilets;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	@Override
	public void calculateBill() {
		System.out.println("The bill for the motorbike is £100");
	}
	
	@Override
	public String toString() {
		return "Train [toilets = " + toilets + ", windows = " + windows + ", Make = " + getMake() + ", Colour = "
				+ getColour() + ", Wheels = " + getWheels() + ", Length = " + getLength() + "]";
	}
	
	
}

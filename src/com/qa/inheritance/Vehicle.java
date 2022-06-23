package com.qa.inheritance;

public class Vehicle {

	private String make;
	private String colour;
	private int wheels;
	private double length;
	
	public Vehicle(String make, String colour, int wheels, double length) {
		super();
		this.make = make;
		this.colour = colour;
		this.wheels = wheels;
		this.length = length;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void calculateBill() {
		System.out.println("");
	}
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", colour=" + colour + ", wheels=" + wheels + ", length=" + length + "]";
	}
	
}

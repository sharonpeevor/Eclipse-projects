package com.qa.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> listOfVehicles = new ArrayList<>();
	
	public void add(Vehicle input) {
		listOfVehicles.add(input);
	}
	
	public void printList() {
		for (Vehicle vehicle : listOfVehicles) {
		System.out.println(vehicle);
		}
	}
	
	public void calculateBills() {
		for (Vehicle vehicle : listOfVehicles) {
			vehicle.calculateBill();
		}
	}
	
	public void removeByType(String type) {
		List<Vehicle> toBeRemoved = new ArrayList<>();
		
		for (Vehicle vehicle : listOfVehicles) {
			if (vehicle.getClass().getSimpleName().equals(type)) {
			toBeRemoved.add(vehicle);
			}
		}
		
		for (Vehicle vehicle : toBeRemoved) {
			listOfVehicles.remove(vehicle);
			System.out.println("Vehicle removed!");
		}
	}
	
	public void empty() {
		listOfVehicles.clear();
		System.out.println("The garage was emptied!");
	}
}

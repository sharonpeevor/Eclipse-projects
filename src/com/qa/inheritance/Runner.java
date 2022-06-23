package com.qa.inheritance;

public class Runner {

	public static void main(String[] args) {

		Car car = new Car("Volvo", "grey", 4, 6.1, 4, false);
		Motorbike motorbike = new Motorbike("Honda", "blue", 2, 3.5, 5, 125);
		Train train = new Train("CrossCountry", "red", 100, 60.8, true, 50);
		
		Garage gar = new Garage();
		
		gar.add(car);
		gar.add(motorbike);
		gar.add(train);
		
		gar.printList();
		
		gar.calculateBills();
		
		gar.removeByType("Car");
		gar.printList();
		
		gar.empty();
		gar.printList();

	}

}

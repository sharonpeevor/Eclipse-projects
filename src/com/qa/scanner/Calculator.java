package com.qa.scanner;

import java.util.Scanner;

public class Calculator {

	public void add(int numOne, int numTwo) {
		System.out.println(numOne + numTwo);
	}
	
	public void multiply(int numOne, int numTwo) {
		System.out.println(numOne * numTwo);
	}
	
	public void subtract(int numOne, int numTwo) {
		System.out.println(numOne - numTwo);
	}
	
	public void divide(double numOne, double numTwo) {
		System.out.println(numOne / numTwo);
	}

	public void chooseMethod() {
		Scanner scanner = new Scanner(System.in);
	
		boolean flag = true;
	
		while(flag) {
		System.out.println("Enter a number: ");
		Integer numOne = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter another number: ");
		Integer numTwo = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Choose a method from add, multiply, subtract or divide: ");
		String choice = scanner.nextLine();
		
		if (choice.equalsIgnoreCase("add")) {
			add();
		} else if (choice.equalsIgnoreCase("multiply")) {
			multiply();
		} else if (choice.equalsIgnoreCase("subtract")) {
			subtract();
		} else if (choice.equalsIgnoreCase("divide")) {
			divide();
		} else (System.out.println("Invalid choice")){
			
		}
		
		
		
		}
		
	}
}

package com.qa.exceptions;

public class Runner {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		try {
			calc.sum();	
		} catch (DivisionException de) {
			System.out.println(de.getMessage());
		}



	}

}

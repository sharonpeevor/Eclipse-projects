package com.qa.operators;

public class Runner {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.addition(10, 5);
		calc.multiplication (10, 5);
		calc.subtraction (10, 5);
		calc.division (10, 3);
	}

}

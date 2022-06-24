package com.qa.scanner;

import com.qa.operators.Calculator;

public class Runner {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		calc.add(10, 5);
		calc.multiply (10, 5);
		calc.subtract (10, 5);
		calc.divide (10, 3);

	}

}

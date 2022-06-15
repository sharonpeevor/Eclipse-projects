package com.qa.conditionals;

public class CalculatorRevisited {

	public void division(double numOne, double numTwo) {
		if(numOne < numTwo) {
			System.out.println(numOne / numTwo);
		} else {
			System.out.println("The division cannot be performed");
		}
	}
}

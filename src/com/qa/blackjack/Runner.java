package com.qa.blackjack;

public class Runner {

	public static void main(String[] args) {
		
		int numOne = 6;
		int numTwo = 18;
		
		if (numOne > numTwo && numOne <= 21) {
			System.out.println(numOne);
		} else if (numTwo > numOne && numTwo <= 21) {
			System.out.println(numTwo);
		} else if (numOne > 21 && numTwo <= 21) {
			System.out.println(numTwo);
		} else if (numTwo > 21 && numOne <= 21) {
			System.out.println(numOne);
		} else {
			System.out.println("0");
		}

	}

}

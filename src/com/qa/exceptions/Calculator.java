package com.qa.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public void sum() throws DivisionException {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Please enter two integers: ");

			int numOne = 0;
			int numTwo = 0;

			try {
				numOne = scanner.nextInt();
				numTwo = scanner.nextInt();
				
				if (numTwo > numOne) {
					throw new DivisionException();
				}
				
				System.out.println("The answer is: " + numOne/numTwo);
			} catch (InputMismatchException ime) {
				System.out.println("You didn't enter an integer");
			} catch (ArithmeticException ae) {
				System.out.println(ae.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				scanner.close();
			}
	}
}

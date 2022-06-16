package com.qa.flowchart2;

public class Runner {

	public static void main(String[] args) {
	
		int input = 400;
				
		if (input > 2000) {
			System.out.println("A");
			if (input > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
			}
			if (input > 4000) {
				System.out.println("D");
			} else {
				System.out.println("E");
			}
		} else {
			System.out.println("1");
			if (input > 100) {
				System.out.println("3");
				if (input > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (input > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}

}

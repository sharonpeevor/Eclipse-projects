package com.qa.taxclass;

public class Tax {

	public int salary;

	public Tax(int salary) {
		this.salary = salary;
	}
	
	public void methodOne() {	
		if (salary < 15000) {
			System.out.println("Tax is: 0%");
		} else if (salary >= 15000 && salary < 20000) {
			System.out.println("Tax is: 10%");
		} else if (salary >= 20000 && salary < 30000) {
			System.out.println("Tax is: 15%");
		} else if (salary >= 30000 && salary < 45000) {
			System.out.println("Tax is: 20%");
		} else {
			System.out.println("Tax is: 25%");
		}
	}	
	
	public void methodTwo( ) {
		if (salary < 15000) {
			System.out.println("Tax is: " + (salary * 0));
		} else if (salary >= 15000 && salary < 20000) {
			System.out.println("Tax is: " + (salary * 0.1));
		} else if (salary >= 20000 && salary < 30000) {
			System.out.println("Tax is: " + (salary * 0.15));
		} else if (salary >= 30000 && salary < 45000) {
			System.out.println("Tax is: " + (salary * 0.2));
		} else {
			System.out.println("Tax is: " + (salary * 0.25));
		}
	}
}

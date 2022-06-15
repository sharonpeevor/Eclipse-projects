package com.qa.constructors;

public class Runner {

	public static void main(String[] args) {
		Person sharon = new Person("Sharon", 36, 7);
		
		Person stephen = new Person("Stephen", 46, 8);
		
		System.out.println(sharon.name);
		System.out.println(sharon.age);
		System.out.println(sharon.shoeSize);
		System.out.println();
		System.out.println(stephen.name);
		System.out.println(stephen.age);
		System.out.println(stephen.shoeSize);

	}

}

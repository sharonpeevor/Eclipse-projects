package com.qa.encapsulation;

public class Runner {

	public static void main(String[] args) {

		Person sharon = new Person("Sharon", 21, "Trainee");
		
		System.out.println(sharon);

		Person stephen = new Person("Stephen", 34, "Director");
		
		System.out.println(stephen);
		
		GirlBoy gb = new GirlBoy();
		
		gb.addPerson(sharon);
		gb.addPerson(stephen);
		
		System.out.println(gb.size());
		
		gb.search("Stephen");
		
		gb.print();
	}

}

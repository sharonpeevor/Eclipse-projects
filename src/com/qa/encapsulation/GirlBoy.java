package com.qa.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class GirlBoy {

	private List<Person> girlBoy = new ArrayList<>(); 
		
	public void addPerson(Person input) {
		girlBoy.add(input);
	}
	
	public int size() {
		return girlBoy.size();
	}
	
	public void search(String name) {
		for (Person person : girlBoy) {
			if(person.getName().equals(name)) {
				System.out.println("Person Found");
			}
		}
	}
		
	public void print() { 
		for(Person name : girlBoy) {
			System.out.println(name);
		}
	}
		
	
	

	
	
}

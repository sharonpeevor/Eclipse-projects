package com.qa.enhancedforloop;

import java.util.ArrayList;
import java.util.List;

public class exercise1 {

	public static void main(String[] args) {

		List<String> myArray = new ArrayList<>();
		myArray.add("Sharon");
		myArray.add("Mum");
		myArray.add("Benji");
		
		for(String name : myArray) {
			System.out.println(name);
			
		}

	}

}

package com.qa.hashsets;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {

		HashSet<String> myHashSet = new HashSet<>();
		
		myHashSet.add("Sharon");
		myHashSet.add("Benji");
		myHashSet.add("Stephen");
		
		System.out.println(myHashSet);
		
		System.out.println(myHashSet.size());
		
		System.out.println(myHashSet.isEmpty());
		
		System.out.println(myHashSet.contains("Benji"));
		
		for (String names : myHashSet) {
			System.out.println(names);
		}
		
		myHashSet.forEach(System.out::println);
	}

}

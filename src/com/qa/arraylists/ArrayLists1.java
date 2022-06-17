package com.qa.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists1 {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = new ArrayList<>();

		listOfIntegers.add(4);
		listOfIntegers.add(8);
		listOfIntegers.add(5);
		listOfIntegers.add(9);
		listOfIntegers.add(1);
//
//		System.out.println(listOfIntegers);
//		
//		System.out.println(listOfIntegers.get(3));
		
		for (int i = 0; i < listOfIntegers.size(); i++) {
			System.out.println(listOfIntegers.get(i));
		}

	}

}

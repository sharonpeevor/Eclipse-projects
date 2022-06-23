package com.qa.enhancedforloop;

import java.util.ArrayList;
import java.util.List;

public class exercise2 {

	public static void main(String[] args) {

		List<Integer> myArray = new ArrayList<>();
		for(int i = 1; i < 21; i++) {
			myArray.add(i);
		}

		for(Integer value : myArray) {
			System.out.println(value * value);
		}
	}

}

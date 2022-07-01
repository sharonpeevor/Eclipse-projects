package com.qa.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExerciseTwo {

	public static void main(String[] args) {

		List<Integer> myIntList = List.of(3, 4, 7, 8, 12);
		
		Stream<Integer> myIntStream = myIntList.stream();
		
		int product = myIntStream.reduce((num1, num2) -> num1 * num2).get();
		System.out.println(product);

	}

}

package com.qa.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExerciseThree {

	public static void main(String[] args) {

		List<Integer> myIntList = new ArrayList<>();

		myIntList.add(3);
		myIntList.add(4);
		myIntList.add(7);
		myIntList.add(8);
		myIntList.add(12);

		Stream<Integer> myIntStream = myIntList.stream();

//		int max = myIntStream.max((num1, num2) -> num1.compareTo(num2)).get();
//		System.out.println(max);
//		or
//		int max = myIntStream.max((num1, num2) -> Integer.compare(num1, num2)).get();
//		or
//        int max = myIntStream.max(Integer::compare).get();
//        System.out.print(max);
//
//        Integer max2 = myIntStream.min(Integer::compare).get();
//        System.out.print(max2);

//        myIntStream.filter(number -> number % 2 == 0).forEach(number -> System.out.println(number));

//		myIntStream.filter(number -> number % 2 != 0).forEach(number -> System.out.println(number));
		
//		int sum = myIntStream.reduce((num1, num2) -> num1 + num2).get();
//		System.out.println(sum);
		
		int min = myIntStream.map(number -> number*number).filter(number -> number % 2 != 0).min((num1, num2) -> Integer.compare(num1, num2)).get();
		System.out.println(min);

	}

}

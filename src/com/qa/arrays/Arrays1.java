package com.qa.arrays;

public class Arrays1 {

	public static void main(String[] args) {
		
		int[] otherNumArray = new int[10];
		
		for (int i = 0; i < otherNumArray.length; i++) {
			otherNumArray[i] = i + 5;
			System.out.println(otherNumArray[i]);
		}

	}

}

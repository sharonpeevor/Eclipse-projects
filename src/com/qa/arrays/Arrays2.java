package com.qa.arrays;

public class Arrays2 {

	public static void main(String[] args) {
		
		int[] otherNumArray = new int[5];
		
		for (int i = 0; i < otherNumArray.length; i++) {
			otherNumArray[i] = (i + 3)*10;
			System.out.println(otherNumArray[i]);
		}
	}

}

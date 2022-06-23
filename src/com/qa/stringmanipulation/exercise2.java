package com.qa.stringmanipulation;

public class exercise2 {

	public void methodOne (String message) {
		String[] words = message.split(" ");
		
		for(String word : words) {
			System.out.println(word);
		}
	}
	
	public void methodFour (String message, String phrase) {
		System.out.println(message.contains(phrase));
	}
}

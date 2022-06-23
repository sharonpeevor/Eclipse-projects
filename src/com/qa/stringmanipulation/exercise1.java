package com.qa.stringmanipulation;

public class exercise1 {

	public static void main(String[] args) {

		String sentence = "yesterday it was raining";
		String sentenceTwo = "today it is sunny";
		
		String sentenceThree = sentenceTwo + ", " + sentence;
		System.out.println(sentenceThree.toUpperCase());

		String sentenceFour = sentenceThree.substring(0, 12);
		String sentenceFive = sentenceThree.substring(36, sentenceThree.length());
		String sentenceSix = sentenceFour.concat(sentenceFive);
		System.out.println(sentenceSix.toUpperCase());
	}

}

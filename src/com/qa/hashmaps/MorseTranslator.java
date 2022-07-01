package com.qa.hashmaps;

import java.util.HashMap;
import java.util.Map.Entry;

public class MorseTranslator {

	private HashMap<String, String> morseMap = new HashMap<>();
	
	public MorseTranslator() {
		this.morseMap.put(".---", "a");
		this.morseMap.put(".-", "b");
		this.morseMap.put("...-", "c");
		this.morseMap.put("..", "d");
		this.morseMap.put("...", "e");
		this.morseMap.put("-.-.", "f");
		this.morseMap.put("---", "g");
		this.morseMap.put(".-..", "h");
		this.morseMap.put("-.-", "i");
	}
		
	public void translate(String input) {
	
		String[] inputArray = input.split(" ");
		
		for (String value : inputArray) {
			System.out.println(morseMap.get(value));
		}
	}
		
		
}


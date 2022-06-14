package com.qa.datatypes;

public class DataTypes {

	public static int methodOne() {
	    return 0;
	}
	public static boolean methodTwo() {
	    return true;
	}
	public static char methodThree() {
	    return 'P';
	}
	public static long methodFour() {
	    return 52L;
	}
	public static float methodFive() {
	    return 0.6f;
	}
	public static String methodSix() {
	    return "Hi there";
	}
	public static void methodSeven() {
	    System.out.println("I'm void!");
	}
	public static void main(String[] args) {
//		int result = methodOne();
//		System.out.println(result);
		
		System.out.println(methodOne());
		System.out.println(methodTwo());
		System.out.println(methodThree());
		System.out.println(methodFour());
		System.out.println(methodFive());
		System.out.println(methodSix());
		methodSeven();
		}
}

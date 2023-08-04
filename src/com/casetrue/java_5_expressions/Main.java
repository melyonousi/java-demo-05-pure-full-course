package com.casetrue.java_5_expressions;

/**
 * @author EL_YONOUSI
 * @date Feb 23, 2022, 12:24:17 PM
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// expression = operands & operators
		// operands = values, variables, number and quantity
		// operators = (+, -, *, /, %)
		
		// method 1
		int friends = 7;
		friends = friends + 1;
		System.out.println("I have: " + friends + " friends");
		
		// method 2
		int follows = 3;
		follows += 1;
		System.out.println("I have: " + follows + " follows");
		
		// method 3
		int likes = 9;
		likes++;
		System.out.println("I have: " + likes + " likes");
	}

}

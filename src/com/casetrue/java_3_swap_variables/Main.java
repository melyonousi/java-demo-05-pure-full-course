package com.casetrue.java_3_swap_variables;

/**
 * @author EL_YONOUSI
 * @date Feb 23, 2022, 11:59:44 AM
 */
public class Main {

	public static void main(String[] args) {
		String x = "water";
		String y = "Sukar";

		System.out.println("Before:: ");
		System.out.println("X = " + x);
		System.out.println("Y = " + y);

		String temp = x;

		x = y;
		y = temp;

		System.out.println("Afert:: ");
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}

}

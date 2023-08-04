package com.casetrue.java_11_logical_operators;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		/**
		 * logical oprators = used to connect two ore more expressions
		 * && = (AND) both condition must be true
		 * // = (OR) either condition must be true
		 * ! = (NOT) reverses boolean value of condition
		 */

		int temp = Math.abs(new Random().nextInt(10) + 1);

		if (temp == 3) {
			System.out.println("it's equal 3");
		} else if (temp > 3 && temp <= 7) {
			System.err.println("it's between 3 and 7");
		} else {
			System.err.println("Out of section");
		}

		System.out.println("let's play!! Press 'q' or 'Q' to Quit");

		Scanner sc = new Scanner(System.in);

		char res = sc.nextLine().charAt(0);

		sc.close();

		if (res == 'q' || res == 'Q') {
			System.out.println("see you next time!♥");
		} else {
			System.out.println("Go a head ☺");
		}
	}
}
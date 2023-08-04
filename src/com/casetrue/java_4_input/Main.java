package com.casetrue.java_4_input;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author EL_YONOUSI
 * @date Feb 23, 2022, 12:06:57 PM
 */
public class Main {

	public static void main(String[] args) {
		
		// we use this class to read from data from the console
		Scanner sc = new Scanner(System.in);
		
		// display message
		System.out.print("Your Full Name:: ");
		
		// store value
		String fullName = sc.nextLine(); // nextLine method accept every value
		
		sc.nextLine(); // important* just to clear console from /n if we need it again
		
		System.out.print("Your Birthday Year: ");
		int age  = sc.nextInt(); // nextInt method accept integer only
		
		// display the value coming
		System.out.println("Thank you: " + fullName + " you have " + (LocalDate.now().getYear() - age) + " years old");
	
		// close the scanner
		sc.close();
	}

}

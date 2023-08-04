package com.casetrue.java_10_switch_statement;

import java.time.LocalDate;

/**
 * @author EL_YONOUSI
 * @date Feb 24, 2022, 9:37:04 AM
 */
public class Main {

	public static void main(String[] args) {

		String today = LocalDate.now().getDayOfWeek().toString().toLowerCase();

		switch (today) {
			case "monday":
				System.out.println("It's " + today.toUpperCase());
				break;
			case "tuesday":
				System.out.println("It's " + today.toUpperCase());
				break;
			case "wednesday":
				System.out.println("It's " + today.toUpperCase());
				break;
			case "thursday":
				System.out.println("It's " + today.toUpperCase());
				break;
			case "friday":
				System.out.println("It's " + today.toUpperCase());
				break;
			case "saturday":
				System.out.println("It's " + today.toUpperCase());
				break;
			case "sunday":
				System.out.println("It's " + today.toUpperCase());
				break;
			default:
				System.out.println("It's Not a day name");
				break;
		}
	}

}

package com.casetrue.java_9_if_statement;

import java.time.LocalDate;

/**
 * @author EL_YONOUSI
 * @date Feb 23, 2022, 1:22:12 PM
 */
public class Main {

	public static void main(String[] args) {
		int age = 18;

		LocalDate birthday = LocalDate.parse("1996-03-05");

		if (age >= 18) {
			System.out.println("You are an adult");
		} else if (age >= 7) {
			System.out.println("You are a kid");
		} else {
			System.out.println("You are a child");
		}

		// line condition
		String celebrate = "My birthday is: ";
		celebrate += birthday.getDayOfYear() == LocalDate.now().getDayOfYear() ? "waw!! it's my birhday"
				: "lol! not yet";

		// display result
		System.out.println(celebrate);
	}

}

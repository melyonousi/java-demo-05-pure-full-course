/**
 * @author EL_YONOUSI
 * @date Feb 23, 2022, 11:33:35 AM
 */
package com.casetrue.java_2_variables;

public class Main {

	public static void main(String[] args) {
		int x; // declaration
		x = 7; // assignment

		int y = 999999999; // initialization

		long z = 999999999999999999L; // should add L in the end in "long" variable

		float xy = 3.7F; // should add F in the end on float variable;

		double zx = 77.33;

		boolean bl = true; // true/false

		char symbole = '@'; // should use '' not ""

		String name = "Mohamed"; // should use "" not '' and is references data type

		// display result
		System.out.println("x = " + x +
				"; y = " + y +
				"; z = " + z +
				"; xy = " + xy +
				"; zx = " + zx + "; bl = " + bl +
				"; symbole = " + symbole +
				"; name  = " + name);
	}
}

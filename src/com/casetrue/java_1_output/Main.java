/**
 * @author EL_YONOUSI
 * @date Feb 23, 2022, 11:31:51 AM
 */
package com.casetrue.java_1_output;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello Mohamed EL YONOUSI, this is a Demo App");

		System.out.print("this is a display line\n");
		System.out.print("like that");
		System.out.println("so to avoid this problem make sure to use" + " println or back slash n (\n)");
		

		// this is a line comment

		/**
		 * this is a multiple lines comment
		 */
		
		
		// use printf to format string
		System.out.printf("result: %d\n", 7 * 3);

		// or use println/print
		System.out.println("result: " + (7 * 3));
		
		// to display error message
		System.err.println("this is an error message");
	}

}

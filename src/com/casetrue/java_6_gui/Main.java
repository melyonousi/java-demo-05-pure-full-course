package com.casetrue.java_6_gui;

import java.time.LocalDate;

import javax.swing.JOptionPane;

/**
 * @author EL_YONOUSI
 * @date Feb 23, 2022, 12:39:16 PM
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * What is GUI G: Graphic U: User I: Interface
		 */

		// display message and store data
		String name = JOptionPane.showInputDialog("Enter Your Name: ");

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Birthday years")); 	// we need to convert data
																								// (dialog return
																								// string)

		// display result
		JOptionPane.showMessageDialog(null,
				"Hello " + name + " your age is: " + (LocalDate.now().getYear() - age) + " years old");
	}

}

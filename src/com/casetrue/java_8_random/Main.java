package com.casetrue.java_8_random;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author EL_YONOUSI
 * @date Feb 23, 2022, 1:11:52 PM
 */
public class Main {

	public static void main(String[] args) {
		// to get randomly number
		Random rn = new Random(); // instance

		int x = rn.nextInt(); // there is more type

		// if we want to limit it
		int y = rn.nextInt(8); // Note random start from 0 to avoid 0 add +1 in the end
		
		JOptionPane.showMessageDialog(null, "x: " + Math.abs(x) + "\ny: " + y); // we sue Math.abs() to avoid -
	}

}

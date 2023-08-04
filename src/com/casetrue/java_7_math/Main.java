package com.casetrue.java_7_math;

import javax.swing.JOptionPane;

/**
 * @author EL_YONOUSI
 * @date Feb 23, 2022, 12:51:11 PM
 */
public class Main {

	public static void main(String[] args) {
		// we use Math class to use it's methods
		// click CTRL + mouse click on class math to know more
		
		double x = 3.14;
		double y = -7;
		
		double z = Math.max(x, Math.abs(y));
		
		System.out.println("the max: " + z);
		
		
		// let us calculate hypotenuse
		double x1 = Double.parseDouble(JOptionPane.showInputDialog("Enter size x1: "));
		double y1 = Double.parseDouble(JOptionPane.showInputDialog("Enter size y1: "));
		
		// to calculate hypotenuse we use this rule (x*y)+(y*y)
		double result = Math.sqrt(Math.pow(x1, 2)+ Math.pow(y1, 2));
		
		// display result
		JOptionPane.showMessageDialog(null, "hypotenuse is: " + result);
	}

}

package com.casetrue.java_68_key_listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements KeyListener {

	JLabel myLabel;
	ImageIcon imageMove;

	MyFrame() {
		imageMove = new ImageIcon(new ImageIcon(getClass().getResource("/assets/waving-hand.png")).getImage()
		.getScaledInstance(100, 100, Image.SCALE_DEFAULT));

		myLabel = new JLabel();
		myLabel.setBounds(0, 0, 100, 100);
		myLabel.setIcon(imageMove);
		// myLabel.setBackground(Color.decode("#FFAA00"));
		// myLabel.setOpaque(true);

		this.add(myLabel);

		// System.out.println("X: " + myLabel.getX() + " Y: " + myLabel.getY());

		this.addKeyListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#FFAA00"));
		this.pack(); // adjust the components
		this.setSize(500, 500);
		this.setLocation(400, 200);
		this.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		/*
		 * keyPressed = invoked when a physical key is pressed down. uses KeyCode, int
		 * output.
		 */

		switch (e.getKeyCode()) {
			case 37:
				myLabel.setLocation(myLabel.getX() - 10, myLabel.getY());
				break;
			case 38:
				myLabel.setLocation(myLabel.getX(), myLabel.getY() - 10);
				break;
			case 39:
				myLabel.setLocation(myLabel.getX() + 10, myLabel.getY());
				break;
			case 40:
				myLabel.setLocation(myLabel.getX(), myLabel.getY() + 10);
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		/*
		 * keyReleased = called whenever a button is released.
		 */
		System.out.println("keyReleased: keyChar = " + e.getKeyChar() + " keyCode = " + e.getKeyCode());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		/*
		 * keyTyped = invoked when a key is typed. uses KeyChar, char output.
		 */

		switch (e.getKeyChar()) {
			case 'a':
				myLabel.setLocation(myLabel.getX() - 10, myLabel.getY());
				break;
			case 'w':
				myLabel.setLocation(myLabel.getX(), myLabel.getY() - 10);
				break;
			case 's':
				myLabel.setLocation(myLabel.getX(), myLabel.getY() + 10);
				break;
			case 'd':
				myLabel.setLocation(myLabel.getX() + 10, myLabel.getY());
				break;
		}
	}
}

package com.casetrue.java_69_mouse_listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements MouseListener {

	JLabel myLabel;
	ImageIcon smile;
	ImageIcon nervous;
	ImageIcon pain;
	ImageIcon dizzy;

	MyFrame() {
		smile = new ImageIcon(new ImageIcon(getClass().getResource("/assets/smile.png")).getImage()
				.getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		nervous = new ImageIcon(new ImageIcon(getClass().getResource("/assets/nervous.png")).getImage()
				.getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		pain = new ImageIcon(new ImageIcon(getClass().getResource("/assets/pain.png")).getImage()
				.getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		dizzy = new ImageIcon(new ImageIcon(getClass().getResource("/assets/dizzy.png")).getImage()
				.getScaledInstance(200, 200, Image.SCALE_DEFAULT));

		myLabel = new JLabel();
		myLabel.setIcon(smile);
		myLabel.addMouseListener(this);
		this.add(myLabel);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		// this.getContentPane().setBackground(Color.decode("#FFAA00"));
		this.pack(); // adjust the components
		this.setSize(500, 500);
		this.setLocation(400, 200);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		/*
		 * invoked when the mouse button has been clicked (pressed and released) on a
		 * component.
		 */
		System.out.println("you clicked on a component: X = " + e.getX() + ", Y = " + e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		/*
		 * invoked when the mouse has been pressed on a component.
		 */
		myLabel.setIcon(pain);	}

	@Override
	public void mouseReleased(MouseEvent e) {
		/*
		 * invoked when the mouse has been released on a component.
		 */
		myLabel.setIcon(dizzy);	}

	@Override
	public void mouseEntered(MouseEvent e) {
		/*
		 * invoked when the mouse enters a component.
		 */
		myLabel.setIcon(nervous);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		/*
		 * invoked when the mouse exits a component.
		 */
		myLabel.setIcon(smile);	}
}

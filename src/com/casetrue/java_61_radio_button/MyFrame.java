package com.casetrue.java_61_radio_button;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {

	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;

	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon;

	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		pizzaIcon = new ImageIcon(new ImageIcon(getClass().getResource("/assets/pizza.png")).getImage()
				.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		hamburgerIcon = new ImageIcon(new ImageIcon(getClass().getResource("/assets/hamburger.png")).getImage()
				.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		hotdogIcon = new ImageIcon(new ImageIcon(getClass().getResource("/assets/hotdog.png")).getImage()
				.getScaledInstance(20, 20, Image.SCALE_DEFAULT));

		pizzaButton = new JRadioButton("Pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("Hotdog");

		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);

		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);

		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);

		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);

		this.pack(); // adjust the components
		this.setSize(300, 300);
		this.setLocation(500, 250);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == pizzaButton) {
			JOptionPane.showMessageDialog(null, pizzaButton.getText());
		}

		if (e.getSource() == hamburgerButton) {
			JOptionPane.showMessageDialog(null, hamburgerButton.getText());
		}

		if (e.getSource() == hotdogButton) {
			JOptionPane.showMessageDialog(null, hotdogButton.getText());
		}
	}

}

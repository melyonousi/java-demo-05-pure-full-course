package com.casetrue.java_67_color_chooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

	JButton chooseColor;
	JLabel setColor;

	MyFrame() {

		chooseColor = new JButton("Pick a Color");
		chooseColor.addActionListener(this);

		setColor = new JLabel("will get color");
		setColor.setBackground(Color.decode("#ffaa00"));
		setColor.setFont(new Font("Arial", Font.BOLD, 50));
		// Making the background of the label visible.
		setColor.setOpaque(true);

		this.add(chooseColor);
		this.add(setColor);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack(); // adjust the components
		this.setSize(500, 500);
		this.setLocation(400, 200);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == chooseColor) {
			JColorChooser colorChooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.BLACK);
			setColor.setForeground(color);
			JOptionPane.showMessageDialog(null,"rgba(" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ", " + color.getAlpha() + ")");
		}

	}
}

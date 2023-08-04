package com.casetrue.java_63_slider;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;

	SliderDemo() {
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();

		// Creating a new JSlider object with a minimum value of 0, a maximum value of
		// 100, and a starting
		// value of 50.
		slider = new JSlider(0, 100, 50);
		slider.setPreferredSize(new Dimension(400, 200));

		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);

		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(10);

		slider.setPaintLabels(true);
		slider.setFont(new Font("Arial", Font.PLAIN, 16));
		label.setFont(new Font("Arial", Font.BOLD, 18));
		slider.setOrientation(SwingConstants.VERTICAL);

		label.setText("°C = " + slider.getValue());
		slider.addChangeListener(this);

		panel.add(slider);
		panel.add(label);
		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setLayout(new FlowLayout());
		// frame.pack(); // adjust the components
		frame.setSize(420, 420);
		frame.setLocation(400, 200);
		frame.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("°C = " + String.valueOf(slider.getValue()));
	}
}

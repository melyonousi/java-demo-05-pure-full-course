package com.casetrue.java_64_progress_bar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ProgressBarDemo {

	JFrame frame = new JFrame("Progress Bar Demo");
	JProgressBar bar = new JProgressBar(0, 100);

	ProgressBarDemo() {

		bar.setValue(0);
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true);
		bar.setFont(new Font("Arial", Font.BOLD, 16));
		bar.setForeground(Color.decode("#ffaa00"));
		bar.setBackground(Color.decode("#1f1f1f"));

		frame.add(bar);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		// frame.pack(); // adjust the components
		frame.setSize(420, 420);
		frame.setLocation(400, 200);
		frame.setVisible(true);

		fill();
	}

	private void fill() {
		int counter = 0;
		while (counter <= 100) {
			bar.setValue(counter);
			try {
				if (counter == 100) {
					Thread.sleep(1000);
				}else{
					Thread.sleep(50);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter += 1;
		}
		bar.setString("Done!!");
	}
}

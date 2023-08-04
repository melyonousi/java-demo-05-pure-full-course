package com.casetrue.java_62_combo_box;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {

	JComboBox<String> combo_names;

	MyFrame() {

		String[] animals = { "dog", "cat", "fish" };
		combo_names = new JComboBox<String>(animals);
		combo_names.addActionListener(this);
		combo_names.setEditable(true);
		combo_names.insertItemAt("horse", 1);
		combo_names.addItem("rabbit");
		combo_names.removeItem("horse");
		combo_names.removeItemAt(combo_names.getItemCount() - 1);
		combo_names.setSelectedIndex(combo_names.getItemCount() - 1);
		// combo_names.removeAllItems();

		this.add(new JLabel("Number of animals: " + combo_names.getItemCount()));
		this.add(combo_names);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack(); // adjust the components
		this.setSize(300, 300);
		this.setLocation(500, 200);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == combo_names) {
			System.out.println(combo_names.getSelectedItem());
			JOptionPane.showMessageDialog(
					null,
					"itam: " + combo_names.getSelectedItem() +
							"\nindex: " + combo_names.getSelectedIndex());
		}
	}

}

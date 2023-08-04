package com.casetrue.java_66_select_file;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

	JButton openFile;
	JButton saveFile;

	MyFrame() {

		openFile = new JButton("Select File");
		openFile.addActionListener(this);

		saveFile = new JButton("Save File");
		saveFile.addActionListener(this);

		this.add(openFile);
		this.add(saveFile);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack(); // adjust the components
		this.setSize(500, 500);
		this.setLocation(400, 200);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == openFile) {
			JFileChooser fileChooser = new JFileChooser();
			// Opening a file chooser dialog.
			int response = fileChooser.showOpenDialog(null);

			if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}

		if (e.getSource() == saveFile) {
			JFileChooser fileChooser = new JFileChooser();
			// Setting the default directory to the Downloads folder.
			// fileChooser.setCurrentDirectory(new File("C:\\Users\\melyo\\Downloads"));
			// Opening a file chooser dialog.
			int response = fileChooser.showSaveDialog(null);

			if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
	}
}

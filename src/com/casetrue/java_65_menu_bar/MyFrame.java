package com.casetrue.java_65_menu_bar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyFrame extends JFrame implements ActionListener {

	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;

	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;

	MyFrame() {
		loadIcon = new ImageIcon(new ImageIcon(getClass().getResource("/assets/load.png")).getImage()
				.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		saveIcon = new ImageIcon(new ImageIcon(getClass().getResource("/assets/save.png")).getImage()
				.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		exitIcon = new ImageIcon(new ImageIcon(getClass().getResource("/assets/exit.png")).getImage()
				.getScaledInstance(20, 20, Image.SCALE_DEFAULT));

		menuBar = new JMenuBar();

		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);

		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");

		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);

		// Setting the shortcut key for the menu.
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H

		// Setting the shortcut key for the menu item.
		loadItem.setMnemonic(KeyEvent.VK_L);
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);

		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);

		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		this.setJMenuBar(menuBar);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		// this.pack(); // adjust the components
		this.setSize(500, 500);
		this.setLocation(400, 200);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loadItem) {
			JOptionPane.showMessageDialog(null, loadItem.getText() + " loaded successfully");
		}

		if (e.getSource() == saveItem) {
			JOptionPane.showMessageDialog(null, saveItem.getText() + " saved successfully");
		}

		if (e.getSource() == exitItem) {
			// Exiting the program.
			System.exit(0);
		}
	}
}

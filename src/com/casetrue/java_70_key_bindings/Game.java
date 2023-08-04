package com.casetrue.java_70_key_bindings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {

	JFrame frame;
	JLabel label;

	Action upAction;
	Action rightAction;
	Action downAction;
	Action leftAction;

	Game() {

		label = new JLabel("Game");
		frame = new JFrame("KeyBinding Game");

		upAction = new UpAction();
		rightAction = new RightAction();
		downAction = new DowntAction();
		leftAction = new LeftAction();

		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
		label.getActionMap().put("upAction", upAction);

		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		label.getActionMap().put("rightAction", rightAction);

		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
		label.getActionMap().put("downAction", downAction);

		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		label.getActionMap().put("leftAction", leftAction);

		label.setBackground(Color.RED);
		label.setBounds(100, 100, 100, 100);
		label.setOpaque(true);

		frame.add(label);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setLocation(400, 200);
		frame.setVisible(true);
	}

	public class UpAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY() - 10);
		}

	}

	public class RightAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX() + 10, label.getY());
		}

	}

	public class DowntAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY() + 10);
		}

	}

	public class LeftAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX() - 10, label.getY());
		}

	}
}

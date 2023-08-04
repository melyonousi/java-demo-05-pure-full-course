package com.casetrue.java_52_buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame {

    JButton myButton;
    JLabel myLabel;

    public MyFrame() {
        ImageIcon myIcon = new ImageIcon(
                new ImageIcon(getClass().getResource("/assets/waving-hand.png")).getImage()
                        .getScaledInstance(40, 40, Image.SCALE_DEFAULT));

        ImageIcon labelIcon = new ImageIcon(new ImageIcon(getClass().getResource("/assets/star.png")).getImage()
                .getScaledInstance(80, 80, Image.SCALE_DEFAULT));

        myLabel = new JLabel();
        myLabel.setIcon(labelIcon);
        myLabel.setBounds(150, 250, 150, 150);
        myLabel.setVisible(false);

        myButton = new JButton();
        myButton.setBounds(100, 100, 200, 100);
        myButton.setText("say hello");
        myButton.setFocusable(false);
        myButton.setIcon(myIcon);
        myButton.setHorizontalTextPosition(JButton.CENTER);
        myButton.setVerticalTextPosition(JButton.BOTTOM);
        myButton.setFont(new Font("Magic Sans", Font.BOLD, 20));
        myButton.setIconTextGap(1);
        myButton.setForeground(Color.decode("#ffaa00"));
        myButton.setBackground(Color.decode("#1f1f1f"));
        myButton.setBorder(BorderFactory.createEtchedBorder());
        myButton.setEnabled(true); // default is true
        myButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Hello!");
            myLabel.setVisible(true);
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /** exit out of window */
        this.setLayout(null);
        this.setSize(550, 550);
        this.setLocation(500, 250);
        this.setVisible(true);
        this.add(myButton);
        this.add(myLabel);
    }
}

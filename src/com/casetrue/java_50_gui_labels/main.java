package com.casetrue.java_50_gui_labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("src/assets/logo.jpg");
        Border border = BorderFactory.createLineBorder(Color.RED, 3);

        JLabel label = new JLabel();
        label.setText("I'm a lable");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xf3f3f3));
        label.setFont(new Font("MV Boli", Font.BOLD, 20));
        label.setIconTextGap(100);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 250, 250);

        CustomFrame customFrame = new CustomFrame("make some lables", 500, 500,
                "src/assets/logo.jpg", new Color(0xffaa00), new Color(0xf1f1f1));

        customFrame.setLayout(null);
        customFrame.add(label);
        customFrame.pack();
    }
}

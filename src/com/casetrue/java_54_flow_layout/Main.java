package com.casetrue.java_54_flow_layout;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        /*
         * layout manager = defines the natural layout for components within a container
         * FlowLayout = places components in a row, sized at their preferred size;
         * if the horizontal space in the container is to small,
         * the FlowLayout class uses the next available row.
         */

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("FlowLayout");
        frame.setBackground(Color.decode("#21333d"));
        frame.setForeground(Color.decode("#ffcccc"));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.decode("#21333d"));

        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));

        frame.add(panel);
        frame.setVisible(true);
    }
}

package com.casetrue.java_49_gui_windows;

import java.awt.Color;

public class main {
    public static void main(String[] args) {

        // /**
        // * JFrame = a gui windows to add components to
        // */

        // JFrame frame = new JFrame(); /** creates a frame */
        // frame.setTitle("first JFrame"); /** sets title of frame */
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /** exit out of
        // application */
        // frame.setResizable(false); /** prevent frame from being resized */
        // frame.setSize(420, 420); /** sets the x-dimension and y-dimension of frame */
        // frame.setVisible(true); /** make a frame visible */

        // ImageIcon icon = new ImageIcon("src/assets/logo.jpg"); /** create ana image
        // icon */

        // frame.setIconImage(icon.getImage()); /** change icon of frame */
        // // frame.getContentPane().setBackground(Color.darkGray); /** change color of
        // background */
        // frame.getContentPane().setBackground(new Color(255, 124, 30)); /** change
        // color of background */
        // frame.getContentPane().setForeground(new Color(0xffaa00));; /** change color
        // of background */

        new CustomFrame("my First Gui Frame", 420, 420, "src/assets/logo.jpg", new Color(0xffaa00),
                new Color(0xf1f1f1));
    }
}

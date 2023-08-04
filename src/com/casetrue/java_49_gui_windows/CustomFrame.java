package com.casetrue.java_49_gui_windows;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CustomFrame extends JFrame {
    CustomFrame(String title, int x, int y, String logoPath, Color bgColor, Color frColor) {
        /**
         * JFrame = a gui windows to add components to
         */

        this.setTitle(title); /** sets title of frame */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /** exit out of application */
        this.setResizable(false); /** prevent frame from being resized */
        this.setSize(x, y); /** sets the x-dimension and y-dimension of frame */
        this.setVisible(true); /** make a frame visible */

        ImageIcon icon = new ImageIcon(logoPath); /** create ana image icon */

        this.setIconImage(icon.getImage()); /** change icon of frame */
        // frame.getContentPane().setBackground(Color.darkGray); /** change color of
        // background */
        this.getContentPane().setBackground(bgColor); /** change color of background */
        this.getContentPane().setForeground(frColor); /** change color of background */
    }
}

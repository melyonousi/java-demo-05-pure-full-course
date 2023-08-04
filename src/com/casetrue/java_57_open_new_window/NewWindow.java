package com.casetrue.java_57_open_new_window;

import javax.swing.*;
import java.awt.*;

/**
 * @author Mohamed EL YONOUSI
 * @project .org.eclipse.egit.core.cmp
 * @date 16-07-2022 7:14
 */
public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("hello, this is a first new window open ny java");

    NewWindow() {
        label.setBounds(0, 0, 420, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Open new window");
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

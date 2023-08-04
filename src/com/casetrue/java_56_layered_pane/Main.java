package com.casetrue.java_56_layered_pane;

import javax.swing.*;
import java.awt.*;

/**
 * @author Mohamed EL YONOUSI
 * @project .org.eclipse.egit.core.cmp
 * @date 16-07-2022 7:00
 */
public class Main {
    public static void main(String[] args) {
        /*
         * JLayeredPane = Swing container that provides a third dimension for positioning componenets ex. depth, Z-index
         */

        JLabel label_1 = new JLabel();
        label_1.setOpaque(true);
        label_1.setBackground(new Color(113, 229, 12));
        label_1.setBounds(50, 50, 200, 200);

        JLabel label_2 = new JLabel();
        label_2.setOpaque(true);
        label_2.setBackground(new Color(175, 12, 229));
        label_2.setBounds(100, 100, 200, 200);

        JLabel label_3 = new JLabel();
        label_3.setOpaque(true);
        label_3.setBackground(new Color(12, 229, 204));
        label_3.setBounds(150, 150, 200, 200);

        JLayeredPane jLayeredPane = new JDesktopPane();
        jLayeredPane.setBounds(0, 0, 500, 500);

//        jLayeredPane.add(label_1, JLayeredPane.DEFAULT_LAYER);
//        jLayeredPane.add(label_2, JLayeredPane.DEFAULT_LAYER);
//        jLayeredPane.add(label_3, JLayeredPane.DRAG_LAYER);

        jLayeredPane.add(label_1, Integer.valueOf(0));
        jLayeredPane.add(label_2, Integer.valueOf(2));
        jLayeredPane.add(label_3, Integer.valueOf(1));

        JFrame frame = new JFrame();
        frame.add(jLayeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setTitle("JLayeredPane");
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

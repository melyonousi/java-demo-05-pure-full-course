package com.casetrue.java_55_grid_layout;

import javax.swing.*;
import java.awt.*;

/**
 * @author Mohamed EL YONOUSI
 * @project .org.eclipse.egit.core.cmp
 * q@date 16-07-2022 6:34
 */
public class Main {
    public static void main(String[] args) {
        /*
          * Layout manager = defines the natural layout for components within a container
          * GridLayout = places components in a grid of cells.
          * Each component's takes all the available space within its cell,
          * and each cell is the same size.
        */

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Grid Layout");
        frame.setLayout(new GridLayout(3, 3, 10, 10));

        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton(String.valueOf(i)));
        }

        frame.setVisible(true);
    }
}

package com.casetrue.java_53_border_layout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class MyFrame {
    JFrame frame;

    public MyFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(new JLabel("Hello World!"));
        frame.pack();
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JPanel redPnl = new JPanel();
        JPanel greenPnl = new JPanel();
        JPanel yellowPnl = new JPanel();
        JPanel magentaPnl = new JPanel();
        JPanel bluePnl = new JPanel();

        redPnl.setBackground(Color.RED);
        greenPnl.setBackground(Color.GREEN);
        yellowPnl.setBackground(Color.YELLOW);
        magentaPnl.setBackground(Color.MAGENTA);
        bluePnl.setBackground(Color.BLUE);

        redPnl.setPreferredSize(new Dimension(100, 100));
        greenPnl.setPreferredSize(new Dimension(100, 100));
        yellowPnl.setPreferredSize(new Dimension(100, 100));
        magentaPnl.setPreferredSize(new Dimension(100, 100));
        bluePnl.setPreferredSize(new Dimension(100, 100));

        // sub panels
        JPanel redSubPnl = new JPanel();
        JPanel greenSubPnl = new JPanel();
        JPanel yellowSubPnl = new JPanel();
        JPanel magentaSubPnl = new JPanel();
        JPanel blueSubPnl = new JPanel();

        redSubPnl.setBackground(Color.decode("#dd1968"));
        greenSubPnl.setBackground(Color.decode("#8fce00"));
        yellowSubPnl.setBackground(Color.decode("#ffdb00"));
        magentaSubPnl.setBackground(Color.decode("#c27ba0"));
        blueSubPnl.setBackground(Color.decode("#4425ff"));

        bluePnl.setLayout(new BorderLayout(5, 5)); // make it as parent

        redSubPnl.setPreferredSize(new Dimension(50, 50));
        greenSubPnl.setPreferredSize(new Dimension(50, 50));
        yellowSubPnl.setPreferredSize(new Dimension(50, 50));
        magentaSubPnl.setPreferredSize(new Dimension(50, 50));
        blueSubPnl.setPreferredSize(new Dimension(50, 50));

        bluePnl.add(redSubPnl, BorderLayout.NORTH);
        bluePnl.add(greenSubPnl, BorderLayout.SOUTH);
        bluePnl.add(yellowSubPnl, BorderLayout.WEST);
        bluePnl.add(magentaSubPnl, BorderLayout.EAST);
        bluePnl.add(blueSubPnl, BorderLayout.CENTER);

        // end sub panels

        frame.add(redPnl, BorderLayout.NORTH);
        frame.add(greenPnl, BorderLayout.WEST);
        frame.add(yellowPnl, BorderLayout.EAST);
        frame.add(magentaPnl, BorderLayout.SOUTH);
        frame.add(bluePnl, BorderLayout.CENTER);
    }
}

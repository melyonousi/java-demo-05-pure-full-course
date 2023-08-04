package com.casetrue.java_60_checkbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;

/**
 * @author Mohamed EL YONOUSI
 * @project .org.eclipse.egit.core.cmp
 * @date 23-07-2022 10:24
 */
public class MyFrame extends JFrame implements ActionListener {
    JCheckBox cbRobot;
    JLabel lblJender;
    JButton submit;
    ImageIcon trueIcon;
    ImageIcon falseIcon;

    MyFrame() {
        trueIcon = new ImageIcon(new ImageIcon("src/assets/true.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        falseIcon = new ImageIcon(new ImageIcon("src/assets/false.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));

        lblJender = new JLabel("*");
        cbRobot = new JCheckBox("I'm not a robot");
        cbRobot.setIcon(falseIcon);
        cbRobot.setSelectedIcon(trueIcon);

        submit = new JButton("Submit");
        submit.addActionListener(this);

        this.add(lblJender);
        this.add(cbRobot);
        this.add(submit);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack(); // adjust the components
        this.setLocationRelativeTo(null);
        this.setTitle("first text field");
        this.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            if (cbRobot.isSelected())
                System.out.println("you are not a robot");
            else
                System.out.println("you are a robot");
        }
    }
}

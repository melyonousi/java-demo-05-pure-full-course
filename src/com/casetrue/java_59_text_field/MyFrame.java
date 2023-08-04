package com.casetrue.java_59_text_field;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Mohamed EL YONOUSI
 * @project .org.eclipse.egit.core.cmp
 * @date 23-07-2022 10:24
 */
public class MyFrame extends JFrame implements ActionListener {
    JButton btnSubmit;
    JTextField email;
    JTextField password;
    JLabel lblEmail;
    JLabel lblPassword;

    MyFrame() {
        lblEmail = new JLabel("Email: ");
        email = new JTextField();
        textFieldCustom(email);
        email.setToolTipText("field email");

        lblPassword = new JLabel("Password: ");
        password = new JTextField();
        textFieldCustom(password);
        password.setToolTipText("field password");

        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(this);

        this.add(lblEmail);
        this.add(email);
        this.add(lblPassword);
        this.add(password);
        this.add(btnSubmit);
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
        if (e.getSource() == btnSubmit) {
            if (email.getText().equals("elyonousi@gmail.com") && password.getText().equals("pass123")) {
                System.out.println("you are logged in");
                valide(email);
                valide(password);
                btnSubmit.setEnabled(false);
            } else {
                invalid(email);
                invalid(password);
                System.out.println("email or password invalid");
            }
        }
    }

    private void valide(JTextField jTextField){
        jTextField.setForeground(new Color(93, 255, 0));
    }

    private void invalid(JTextField jTextField){
        jTextField.setForeground(new Color(255, 0, 38));
    }

    private void textFieldCustom(JTextField jTextField){
        jTextField.setPreferredSize(new Dimension(250, 40));
        jTextField.setFont(new Font("Consolas", Font.PLAIN, 20));
        jTextField.setCaretColor(Color.PINK);
    }
}

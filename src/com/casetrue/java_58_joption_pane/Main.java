package com.casetrue.java_58_joption_pane;

import javax.swing.*;

/**
 * @author Mohamed EL YONOUSI
 * @project .org.eclipse.egit.core.cmp
 * @date 23-07-2022 7:38
 */
public class Main {
    public static void main(String[] args) {
        /*
         * JOptionPane = pop up a standard dialog box that prompts users for a value
         *               or informs them  of something.
         */

        // JOptionPane.showMessageDialog(null, "this is some useless info", "this is a title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "this is information's message", "this is a title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "this is a question message", "this is a title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "this is a warning message", "this is a title", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "this is an error message", "this is a title", JOptionPane.ERROR_MESSAGE);

        // int response = JOptionPane.showConfirmDialog(null, "this is a confirm dialog", "this is my titile", JOptionPane.YES_NO_CANCEL_OPTION);
        /*
         * 0: yes
         * 1: no
         * 2: cancel
         */

        // String fullName = JOptionPane.showInputDialog("what's your name");
        // System.out.println("your name is " + fullName);

        String[] joptionResopnse = {"No, ansewer", "thank you", "*blush*", "lol"};
        ImageIcon icon = new ImageIcon("src/assets/info.png");
        int result = JOptionPane.showOptionDialog(null, "this is option dialog", "this is a custom titile", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, joptionResopnse, 0);
        System.out.println("result: " + result);
    }
}

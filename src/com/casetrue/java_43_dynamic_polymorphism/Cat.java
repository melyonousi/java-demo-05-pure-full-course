package com.casetrue.java_43_dynamic_polymorphism;

import javax.swing.JOptionPane;

public class Cat extends Animal {
    @Override
    public void speak() {
        JOptionPane.showMessageDialog(null, "cat goes meow");
    }
}

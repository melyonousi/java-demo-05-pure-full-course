package com.casetrue.java_43_dynamic_polymorphism;

import javax.swing.JOptionPane;

public class Dog extends Animal {
    @Override
    public void speak() {
        JOptionPane.showMessageDialog(null, "dog goes bark");
    }
}

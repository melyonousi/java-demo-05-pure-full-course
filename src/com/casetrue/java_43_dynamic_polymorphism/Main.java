package com.casetrue.java_43_dynamic_polymorphism;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        /**
         * poly-morphism = many shapes / forms
         * dynamic = after compilation (during runtime)
         * ex. A corvette is a: corvette, a car, a vehicle, and an object
         */

        Animal animal;

        int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "What animal do you want?\n1:: dog\n2:: cat"));

        switch (choice) {
            case 1:
                animal = new Dog();
                animal.speak();
                break;

            case 2:
                animal = new Cat();
                animal.speak();
                break;

            default:
                animal = new Animal();
                animal.speak();
                break;
        }
    }
}
package com.casetrue.java_35_method_overriding;

public class Main {
    public static void main(String[] args) {
        /**
         * method overriding = declaring a method in sub class, wich
         * is already present in parent class.
         * done so that a child class can give it's own implementation
         */
        
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.speak();
        dog.speak();
    }

}
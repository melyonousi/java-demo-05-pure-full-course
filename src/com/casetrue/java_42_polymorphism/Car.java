package com.casetrue.java_42_polymorphism;

public class Car extends Vehicle {
    @Override
    public void go() {
        System.out.println("*** The car begins moving ***");
    }
}

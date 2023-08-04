package com.casetrue.java_35_method_overriding;

public class Dog extends Animal {

    @Override
    void speak() {
        System.out.println("the dog goes \"bark\"");
    }
}

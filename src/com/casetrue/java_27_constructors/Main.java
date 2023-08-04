package com.casetrue.java_27_constructors;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Mohamed", 26);
        Human human2 = new Human("Khaouda", 25, 55);

        System.out.println(human1.toString());
        System.out.println();
        System.out.println(human2.toString());
    }
}

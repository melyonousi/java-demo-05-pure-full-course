package com.casetrue.java_22_methods;

public class Main {
    public static void main(String[] args) {
        /**
         * method = a block of code that is excuted whenever it is called upon
         */

        sayHello();
        sayHelloWithParams("Mohamed", 26);
        System.out.println(getFullName("Mohamed", "EL YONOUSI"));
    }

    static void sayHello() {
        System.out.println("hello");
    }

    static void sayHelloWithParams(String name, int age) {
        System.out.println("hello " + name + " you have " + age + " years old");
    }

    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}

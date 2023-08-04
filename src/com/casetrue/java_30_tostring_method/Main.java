package com.casetrue.java_30_tostring_method;

public class Main {
    public static void main(String[] args) {
        /**
         * toString() = special method that all objects inherit, that returns a string
         * that "textually represents" an object.
         * can be used both implicity and explicitly.
         */

         Car car = new Car();
         
         System.out.println(car.toString());
         System.out.println();
         System.out.println(car); // obect take toString() as default method
    }
}

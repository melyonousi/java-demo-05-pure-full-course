package com.casetrue.java_36_super_keyword;

public class Main {
    public static void main(String[] args) {
        /**
         * super = keyword refer to the superclass (parent) of an object
         * very similar to the "this" keyword
         */

        Hero hero = new Hero("Batman", 42, "$$$");

        System.out.println(hero.toString());
    }
}

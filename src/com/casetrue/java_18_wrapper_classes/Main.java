package com.casetrue.java_18_wrapper_classes;

public class Main {
    public static void main(String[] args) {
        /**
         * wrapper classes = provides a way to use data type as reference data type
         * reference data type contain useful methods
         * can be used with collections (ex: ArrayList)
         * 
         * primitive | wrapper
         * ---------- ----------
         * boolean Boolean
         * char Char
         * int Character
         * double Double
         * 
         * autoboxing = the automatic conversion that the java compiler makes between
         * the primitive
         * types and their corresponding object wrapper classes
         * unboxing = the reverse autoboxing. Automactic conversion of wrapper class to
         * primitive
         */

        Boolean bool = true;
        System.out.println(bool.toString());

        Character character = 'M';
        System.out.println(character.toString().toLowerCase());

        Integer integer = 7;
        System.out.println(integer.doubleValue());

        Double double1 = 7.3;
        System.out.println(double1.intValue());

        String name = "mohamed";
        System.out.println(name.hashCode());
     }
}

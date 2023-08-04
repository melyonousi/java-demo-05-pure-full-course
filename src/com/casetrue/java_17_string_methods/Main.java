package com.casetrue.java_17_string_methods;

public class Main {
    public static void main(String[] args) {
        /**
         * String = a references data type that can store one or more characters
         * referece data types have access to useful methods
         */

        String name = "Mohamed";

        // equals & equalsIgnoreCase
        boolean res1 = name.equals("mohamed"); // ouput: false *case sensetive
        boolean res2 = name.equalsIgnoreCase("mohamed"); // output: true
        System.err.println(res1 + " - " + res2);

        // length
        int nameLength = name.length();
        System.out.println(nameLength);

        // charAt
        char firstCharacter = name.charAt(0);
        System.out.println(firstCharacter);

        // indexOf
        int index = name.indexOf('a'); // search in string return position
        System.out.println(index);

        // isEmpty
        boolean isEmpty = name.isEmpty();
        boolean isBlank = name.isBlank();
        System.out.println(isEmpty + " - " + isBlank);

        // toUpperCase
        String upper = name.toUpperCase();
        System.out.println(upper);

        // toLowerCase
        String lower = name.toLowerCase();
        System.out.println(lower);

        // trim *remove space from begin and end
        String trim = name.trim();
        System.out.println(trim);

        // replace
        String replace = name.replace('e', 'a');
        System.out.println(replace);

        // repeat
        String repeat = name.repeat(2);
        System.err.println(repeat);
    }
}

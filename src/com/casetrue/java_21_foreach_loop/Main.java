package com.casetrue.java_21_foreach_loop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * foreach = traversing technique to iterate through the elements in an
         * array/collection
         * less steps, more readable
         * less flexible
         */

        String[] animals = { "cat", "dog", "rat" };

        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println();

        ArrayList<String> countries = new ArrayList<>();

        countries.add("Morocco");
        countries.add("Algery");
        countries.add("Tunis");
        countries.add("Libia");
        countries.add("Mouritani");

        for (String country : countries) {
            System.out.println(country);
        }
    }
}

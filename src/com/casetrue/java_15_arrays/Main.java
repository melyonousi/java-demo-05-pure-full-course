package com.casetrue.java_15_arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * array = used to store multiple value in a single variable
         */

        String[] cars = { "golf", "ford", "bougati" };

        // edit
        cars[1] = "mercedis";

        String[] animals = new String[3];

        animals[0] = "cats";
        animals[1] = "dogs";
        animals[2] = "mouses";

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toUpperCase());
        }
    }
}

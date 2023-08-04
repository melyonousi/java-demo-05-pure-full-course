package com.casetrue.java_16_arrays_2d;

public class Main {
    public static void main(String[] args) {
        /**
         * 2d array = an array of arrays
         */

        /**
         * 3 rows
         * 2 columns
         * **
         * **
         * **
         */
        String[][] cars = new String[3][2];

        // row 1
        cars[0][0] = "Golf"; // row 1; column 1
        cars[0][1] = "Ford"; // row 1; column 2

        // row 2
        cars[1][0] = "Golf-2";
        cars[1][1] = "Ford-2";

        // row 3
        cars[2][0] = "Golf-3";
        cars[2][1] = "Ford-3";

        for (int i = 0; i < cars.length; i++) /* rows */ {
            System.out.println();

            for (int j = 0; j < cars[i].length; j++) /* columns */ {
                System.out.print(cars[i][j] + "     ");
            }
        }

        System.out.println();

        // another way
        String[][] animals = { { "cat", "dog" }, { "mouse", "tiger" }, { "elephant", "jiraf" } };
        for (int i = 0; i < animals.length; i++) {
            System.out.println();
            for (int j = 0; j < animals[i].length; j++) {
                System.out.print(animals[i][j] + "     ");
            }
        }
    }
}

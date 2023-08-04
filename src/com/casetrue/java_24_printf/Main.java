package com.casetrue.java_24_printf;

public class Main {
    public static void main(String[] args) {
        /*
          printf = an optional method to control, format, and display text to the
          console
          two argument = format string + (object/variable/value)
          % [flags][precisio][width][conversion-character]
         */

        /*
          %d int
          %b boolean
          %c characters
          %s string
          %f double
         */
        int i = 26;
        boolean b = false;
        char character = '@';
        String string = "Mohamed EL YONOUSI";
        double d = 7000.3;

        // [convertion-character]
        System.out.printf("%d", i);
        System.out.printf("%b", b);
        System.out.printf("%c", character);
        System.out.printf("%s", string);
        System.out.printf("%f", d);

        System.out.println();

        /*
          [width]
          minimum number of characters to be written as output
         */
        System.out.printf("hello %.7s", string);

        System.out.println();

        /*
          [precision]
          sets number of digits of precision wher outputting floating-point values
         */
        System.out.printf("you have this much money %.2f", d);

        System.out.println();

        /*
          [flags]
          adds an effect to output based on the flag added to format specifier
          - : left-justify
          + : output a plus (+) or minus (-) sign for a numeric value
          0 : numeric values are zero-padded
          , : comma grouping separator if numbers > 1000
         */

         System.out.printf("lets try flags %,.2f", d);
         System.out.print(".");
    }
}

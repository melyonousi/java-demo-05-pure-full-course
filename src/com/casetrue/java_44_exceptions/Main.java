package com.casetrue.java_44_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * exception = an event that occurs during the excecution of a programs that,
         * dispruts the normal flow of instructions
         */

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a whole number to division: ");
            int x = sc.nextInt();

            System.out.print("Enter a whole number to divide by: ");
            int y = sc.nextInt();

            float z = x / y;

            System.out.println("Result : " + z);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("Done.");
        }

    }
}

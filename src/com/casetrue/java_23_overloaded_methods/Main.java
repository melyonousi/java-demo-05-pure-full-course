package com.casetrue.java_23_overloaded_methods;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /**
         * overloaded methods = methods that share the same name but have diffrent
         * parameters
         * method name + parameters = method signature
         */

        System.out.println(calc(5, 187, '*'));
        System.out.println(calc(4, 2));
        System.out.println(calc());
    }

    static double calc() {
        return Math.abs(new Random().nextInt(1, 20));
    }

    static double calc(double pow, int arg) {
        return Math.pow(pow, arg);
    }

    static double calc(double a, double b, char c) {
        double res = 0;
        switch (c) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                res = 0;
                break;
        }

        return res;
    }
}

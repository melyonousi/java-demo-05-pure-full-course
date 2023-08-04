package com.casetrue.test;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 125; i++) {
            if (i <= 50)
                System.out.println(i + ": Done");
            else
                System.out.println(i + ": progress");
        }
    }
}

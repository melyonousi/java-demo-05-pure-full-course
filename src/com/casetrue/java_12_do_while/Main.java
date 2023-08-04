package com.casetrue.java_12_do_while;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // do while = excutes a block of code at leaste once and then check the
        // condition
        Scanner sc = new Scanner(System.in);

        String name = "";

        do {
            System.out.print("Your Name Please: ");
            name = sc.nextLine().toString();
        } while (name.isBlank());

        sc.close();

        System.out.println("Hello " + name + " you're doing best");
    }
}

package com.casetrue.java_12_while_loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // while loop = excutes a block of code as long as a it's condition remains true
        Scanner sc = new Scanner(System.in);

        String name = "";

        while (name.isBlank()) {
            System.out.print("Your Name Please: ");
            name = sc.nextLine().toString();
        }

        sc.close();

        System.out.println("Hello " + name + " you're doing best");
    }
}

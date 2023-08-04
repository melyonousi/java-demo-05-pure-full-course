package com.casetrue.java_28_variable_scope;

import java.util.Random;

public class DiceRoller {

    Random random = new Random(); // global
    int number; // global

    DiceRoller() {
        Random random = new Random(); // local
        int number = 0; // local
        roll(number, random);
        roll();
    }

    void roll(int number, Random rn) {
        number = rn.nextInt(6) + 1;
        System.out.println(number);
    }

    

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}

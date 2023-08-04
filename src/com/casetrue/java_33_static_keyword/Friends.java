package com.casetrue.java_33_static_keyword;

public class Friends {
    String name;
    static int numberOfFriends;

    Friends(String name) {
        this.name = name;

        numberOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}

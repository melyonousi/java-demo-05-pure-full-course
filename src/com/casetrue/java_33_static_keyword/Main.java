package com.casetrue.java_33_static_keyword;

public class Main {
    public static void main(String[] args) {
        /**
         * static = modifier, a single copy of a variable/methos is created and shared.
         * the class "owns" the static member.
         */

        Friends friend1 = new Friends("Haroun");
        Friends friend2 = new Friends("Mohamed");

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        Friends.displayFriends();
    }
}

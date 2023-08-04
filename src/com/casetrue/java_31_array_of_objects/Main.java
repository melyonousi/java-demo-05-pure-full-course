package com.casetrue.java_31_array_of_objects;

public class Main {

    public static void main(String[] args) {

        // User[] users = new User[2];

        User user = new User("Mohamed", "example@example.com");
        // users[0] = user;

        User user1 = new User("Khaouda", "example@example.com");
        // users[1] = user1;

        User[] users = { user, user1 };

        System.out.println(users[1].name);
    }
}

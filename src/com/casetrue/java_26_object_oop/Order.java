package com.casetrue.java_26_object_oop;

import java.time.LocalDate;

public class Order {
    static int order_number;
    int number = order_number++;
    LocalDate datetime = LocalDate.now();
    String name = "Coffee";
    double price = 14.5;
    int quantity = 2;
    int table = 5;

    double orderTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Number: " + number + "\n" +
                "Date: " + datetime + "\n" +
                "Name: " + name + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity + "\n" +
                "Table: " + table;
    }
}

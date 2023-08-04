package com.casetrue.java_30_tostring_method;

public class Car {
    String mark = "Ford";
    String model = "Musting";
    String color = "white";
    int year = 2022;

    @Override
    public String toString() {
        return "Mark: " + mark + "\n" +
                "Ford: " + model + "\n" +
                "Musting: " + color + "\n" +
                "white: " + color + "\n" +
                "Year: " + year;
    }
}

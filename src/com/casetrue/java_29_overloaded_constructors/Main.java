package com.casetrue.java_29_overloaded_constructors;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella", "pepperoni");
        Pizza pizza1 = new Pizza("thicc crust", "tomato", "mozzarella");

        System.out.println(pizza.toString());
        System.out.println();
        System.out.println(pizza1.toString());
    }
}

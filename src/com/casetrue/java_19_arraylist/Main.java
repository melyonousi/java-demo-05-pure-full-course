package com.casetrue.java_19_arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * ArrayList =  a resizable  array.
         * elements can  added and remove afetr compilation  phase
         * store reference  data type
         */

         ArrayList <String> food = new ArrayList<>();

         food.add("Tajin");
         food.add("Bisara");
         food.add("Tanjia");

         food.set(1, "CousCous"); // replace by index

         food.remove("Tajin"); // remove by object
         food.remove(food.indexOf("CousCous")); // remove by index

         for (int i = 0; i < food.size(); i++) {
             System.out.println(food.get(i));
         }

         food.clear(); // clear ArrayList
    }
}

package com.casetrue.java_42_polymorphism;

public class Main {
    public static void main(String[] args) {
        /**
         * polymorphism = greek word for poly-"many", morph-"form"
         * the ability of an object to identify as more than one type
         */

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};
        for (Vehicle vehicle : racers) {
            vehicle.go();
        }
    }
}

package com.casetrue.java_40_copy_objects;

public class Main {
    public static void main(String[] args) {
        Car car_1 = new Car("chevrolet", "Camaro", 2021);

        /**
         * first: method 1
         * don't use
         * car_2 = car_1
         * let each one by diffrent address memory
         * check compy method in Car class
         */
        Car car_2 = new Car("Ford", "Mustang", 2022);
        car_2.copy(car_1);

        /**
         * second mthod
         */
        Car car_3 = new Car(car_2);

        System.out.println(car_1);
        System.out.println(car_2);
        System.out.println();
        System.out.println(car_1.getMark());
        System.out.println(car_1.getModel());
        System.out.println(car_1.getYear());
        System.out.println();
        System.out.println(car_2.getMark());
        System.out.println(car_2.getModel());
        System.out.println(car_2.getYear());
        System.out.println();
        System.out.println(car_3.getMark());
        System.out.println(car_3.getModel());
        System.out.println(car_3.getYear());
    }
}

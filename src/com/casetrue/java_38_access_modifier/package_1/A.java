package com.casetrue.java_38_access_modifier.package_1;

import com.casetrue.java_38_access_modifier.package_2.C;

public class A {
    public static void main(String[] args) {
        /**
         * Modifier     Class   Package     Subclass    World
         * publlic      yes     yes         yes         yes
         * protected    yes     yes         yes         no
         * no midifier  yes     yes         no          no
         * private      yes     no          no          no
         */

        C c = new C();

        //System.out.println(c.no_deString); // no access modifier
        System.out.println(c.p_deString);
    }
}

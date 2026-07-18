package com.pramod.generics;

public class Geeks4 {

    // A Generic method example

    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);

    }

    public static void main(String[] args) {
        //calling generic method with Integer argument
        genericDisplay(11);


        //calling generics method with String argument
        genericDisplay("Pramod");

    }
}

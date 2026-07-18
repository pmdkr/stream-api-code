package com.pramod.designPatterns.singleton;

public class Singleton {

    // step 1: create a private static object
    private static Singleton instance;

    // step 2 : make contructor private
    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    // step 3: provide public method to access object
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;

    }

    public void display() {
        System.out.println("hello from Singleton Class");

    }

}

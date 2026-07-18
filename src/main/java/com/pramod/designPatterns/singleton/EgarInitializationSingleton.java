package com.pramod.designPatterns.singleton;

public class EgarInitializationSingleton {

    // 1. create instance of object at class loading time

    private static final EgarInitializationSingleton instance = new EgarInitializationSingleton();

    // create private constructor

    private EgarInitializationSingleton() {
        System.out.println("Egar intializatin of instnce object ");

    }

    // create public static method to access the

    public static EgarInitializationSingleton getInstance() {
        return instance;
    }

}

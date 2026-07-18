package com.pramod.designPatterns.singleton;

public class ThreadSafeSingleton {

    // 1 create a private static variable

    private static ThreadSafeSingleton instance;
    // 2. make constructor private

    private ThreadSafeSingleton() {
        System.out.println("thread safe singleton class");
    }

    // 3. create a public method to access object

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            return new ThreadSafeSingleton();
        }

        return instance;
    }

}

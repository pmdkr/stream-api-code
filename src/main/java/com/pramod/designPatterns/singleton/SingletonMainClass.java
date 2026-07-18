package com.pramod.designPatterns.singleton;

public class SingletonMainClass {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.display();
        obj2.display();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2);
    }

}

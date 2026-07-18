package com.pramod.generics;


class Test<T> {

    T obj;

    Test(T obj) {
        this.obj = obj;

    }

    public T getObject() {
        return this.obj;
    }

}

public class Geeks {
    static void main() {
        //instance of Integer type
        Test<Integer> iObj = new Test<>(15);

        System.out.println(iObj.getObject());


        //instance of String type

        Test<String> sObj = new Test<>("Pramod");
        System.out.println(sObj.getObject());


    }

}

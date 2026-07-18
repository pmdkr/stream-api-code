package com.pramod.generics;


class Test1<T, U> {

    T obj1;
    U obj2;

    Test1(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;

    }


    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);

    }
}

public class Geeks2 {

    static void main() {
        Test1<String, Integer> obj = new Test1<String, Integer>("Pramod", 30);


        obj.print();

    }


}

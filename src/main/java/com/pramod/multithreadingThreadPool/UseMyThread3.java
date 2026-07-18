package com.pramod.multithreadingThreadPool;


class MyThread3 implements Runnable {

    String name;
    Thread th;

    MyThread3(String str) {
        th = new Thread(this, str);
        th.start();

    }

    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println(th.getName() + ": " + i);
                Thread.sleep(500);
            }

        } catch (InterruptedException ex) {

        }


    }
}

public class UseMyThread3 {
    public static void main(String[] args) {
        MyThread3 m1 = new MyThread3("child1");

        try {
            m1.th.join();
            System.out.println("Main woked up....");

        } catch (InterruptedException ex) {

        }
    }
}

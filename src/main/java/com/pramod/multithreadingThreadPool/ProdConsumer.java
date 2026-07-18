package com.pramod.multithreadingThreadPool;

class SharedObj {

    private int n;
    private boolean isConsumed = true;

    public synchronized void setObject(int i) {

        while (!isConsumed) {
            try {
                System.out.println("Producer is waiting...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        n = i;
        isConsumed = false;

        System.out.println("Produced : " + i);

        notifyAll();
    }

    public synchronized int getObject() {

        while (isConsumed) {
            try {
                System.out.println("Consumer is waiting...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return -1;
            }
        }

        int value = n;
        isConsumed = true;

        notifyAll();

        return value;
    }
}

class Producer extends Thread {

    private final SharedObj sharedObj;

    Producer(SharedObj sharedObj) {
        this.sharedObj = sharedObj;
    }

    @Override
    public void run() {

        try {

            for (int i = 0; i <= 10; i++) {
                sharedObj.setObject(i);
                Thread.sleep((int) (Math.random() * 1000));
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {

    private final SharedObj sharedObj;

    Consumer(SharedObj sharedObj) {
        this.sharedObj = sharedObj;
    }

    @Override
    public void run() {

        int sum = 0;

        try {

            for (int i = 0; i <= 10; i++) {

                int value = sharedObj.getObject();

                System.out.println("Consumed : " + value);

                sum += value;

                Thread.sleep((int) (Math.random() * 1000));
            }

            System.out.println("Sum = " + sum);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProdConsumer {

    public static void main(String[] args) {

        SharedObj obj = new SharedObj();

        Producer producer = new Producer(obj);
        Consumer consumer = new Consumer(obj);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread completed...");
    }
}
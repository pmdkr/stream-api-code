package com.pramod.multithreadingThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1 {

    public static void main(String[] args) {
        System.out.println("therd pool example");

        // Excuter framework

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // number of task 5

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " is performed by " + Thread.currentThread().getName());
            });
        }

    }

}

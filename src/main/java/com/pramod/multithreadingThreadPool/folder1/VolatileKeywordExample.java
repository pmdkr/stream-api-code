package com.pramod.multithreadingThreadPool.folder1;

public class VolatileKeywordExample {

    volatile boolean keepRunning = true;

    public static void main(String[] args) {

        VolatileKeywordExample obj = new VolatileKeywordExample();
        obj.startRunning();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {

        }
        obj.stopRunning();


    }

    public void startRunning() {

        new Thread(() -> {
            System.out.println("Called the startRunning method...");
            System.out.println("KeepRunning value is : " + keepRunning);
            while (keepRunning) {


            }
            System.out.println("While loop is  stooped");
        }).start();
    }

    public void stopRunning() {
        System.out.println("Calling stopRunning method...");

        keepRunning = false;
        System.out.println("KeepRunning value is : " + keepRunning);

    }


}


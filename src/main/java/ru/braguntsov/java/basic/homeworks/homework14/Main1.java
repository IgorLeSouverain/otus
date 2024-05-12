package ru.braguntsov.java.basic.homeworks.homework14;

public class Main1 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        createArray();
    }

    public static void createArray() throws InterruptedException {
        long start = System.nanoTime();
        int runs = 1000 * 1000;
        double[] array = new double[100_000_000];
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 25_000_000; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 25_000_000; i < 50_000_000; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 50_000_000; i < 75_000_000; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 75_000_000; i < 100_000_000; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        long time = System.nanoTime() - start;
        System.out.printf("The average time taken was %.1f ns%n", (double) time / runs);
    }
}
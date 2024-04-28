package ru.braguntsov.java.basic.homeworks.homework14;

public class Main1 extends Thread {
    public static void main(String[] args) {
        createArray();
    }

    public static void createArray() {
        long start = System.nanoTime();
        int runs = 1000 * 1000;
        double[] array = new double[100_000_000];
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array.length; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array.length; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array.length; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array.length; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        long time = System.nanoTime() - start;
        System.out.printf("The average time taken was %.1f ns%n", (double) time / runs);
    }
}
package ru.braguntsov.java.basic.homeworks.homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] intArray = {6, 1};
        main.method1("asd", 1);
        main.method2(intArray);
        main.method5(intArray);
    }

    private void method1(String s, int num) {
        int n = 0;
        while (n != num) {
            System.out.println(s);
            n++;
        }
    }

    private void method2(int[] ints) {
        long sum = 0;
        for (int i : ints) {
            if (i > 5) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    private void method3(int num, int[] ints) {
        int size = 0;
        while (size != ints.length) {
            ints[size] = num;
            size++;
        }
    }

    private void method4(int num, int[] ints) {
        int size = 0;
        while (size != ints.length) {
            ints[size] = ints[size] + num;
            size++;
        }
    }

    private void method5(int[] ints) {
        int[] part1 = new int[ints.length / 2];
        int[] part2 = new int[ints.length / 2];
        System.arraycopy(ints, 0, part1, 0, part1.length);
        System.arraycopy(ints, part1.length, part2, 0, part2.length);

        int sum1 = Arrays.stream(part1).sum();
        int sum2 = Arrays.stream(part2).sum();
        if (sum1 > sum2) {
            System.out.println("Первая часть больше");
        } else {
            System.out.println("Вторая часть больше");
        }
    }
}

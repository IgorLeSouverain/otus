package ru.braguntsov.java.basic.homeworks.homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] ints = {{2, 2, 2}, {2, 3, 1}, {0, 1, 2}};
        method1(10);
        method2(ints);
        findMax(ints);
    }

    // Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив, метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
    private static int sumOfPositiveElements(int[][] ints) {
        int sum = 0;
        for (int[] i : ints) {
            for (int j : i) {
                if (j > 0) {
                    sum = sum + j;
                }
            }
        }
        return sum;
    }

    // Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из символов * со сторонами соответствующей длины;
    private static void method1(int size) {
        String symbol = "*";
        int j = 0;
        int i = 0;
        while (j != size) {
            while (i != size) {
                System.out.print(symbol);
                i++;
            }
            System.out.println();
            i = 0;
            j++;
        }
    }

    // Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
    private static void method2(int[][] ints) {
        int index = 0;
        for (int[] i : ints) {
            i[index] = 0;
            index++;
        }
    }

    // Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
    private static int[] findMax(int[][] array) {
        int indexSum = 0;
        int[] maxArr = new int[0];
        for (int[] i : array) {
            int arrSum = Arrays.stream(i).sum();
            if (arrSum > indexSum) {
                indexSum = arrSum;
                maxArr = i;
            }
        }
        return maxArr;
    }

    // Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки не существует, то в качестве результата необходимо вернуть -1
    private static int method3(int[][] ints) {
        try {
            return Arrays.stream(ints[1]).sum();
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }
}



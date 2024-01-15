package ru.braguntsov.java.basic.homeworks.homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        switch (number)  {
            case 1:
                main.greetings();
                break;
            case 2:
                int var1 = (int)(Math.random()*50) - 30;
                int var2 = (int)(Math.random()*50) - 30;
                int var3 = (int)(Math.random()*50) - 30;
                System.out.println(main.checkSign(var1, var2, var3));
                break;
            case 3:
                main.compareNumbers();
                break;
            case 4:
                main.selectColor();
                break;
            case 5:
                int var4 = (int)(Math.random()*30) - 30;
                int var5 = (int)(Math.random()*30) - 30;
                System.out.println(main.addOrSubtractAndPrint(var4, var5, false));
                break;
        }
    }
    public void greetings() {
        System.out.print("Hello");
        System.out.print(" World");
        System.out.print(" from");
        System.out.print(" Java");
    }

    public String checkSign(int a, int b, int c) {
        int sum = a + b + c;

        if (sum >= 0) {
            return "Сумма положительная";
        } else {
            return "Сумма отрицательная";
        }
    }

    public void selectColor() {
        int data = 0;

        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public void compareNumbers() {
        int a = 0, b = 0;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public int addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            return initValue + delta;
        } else {
            return initValue - delta;
        }
    }
}
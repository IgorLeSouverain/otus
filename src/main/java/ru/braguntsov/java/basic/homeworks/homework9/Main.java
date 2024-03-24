package ru.braguntsov.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static ru.braguntsov.java.basic.homeworks.homework9.Employee.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(7);
        integers.add(1);
        integers.add(6);
        System.out.println(ascendingInts(9, 7));
        System.out.println(arraySum(integers));
        replaceArrayInts(integers, 2);
        System.out.println(integers);
        increaseArrayInts(integers, 3);
        System.out.println(integers);

        Employee employee = new Employee("Egor", 18);
        Employee employee1 = new Employee("Dima", 19);
        Employee employee2 = new Employee("Anton", 20);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);

        System.out.println(getEmployeesNames(employees));
        System.out.println(getEmployeesWithMinAge(employees, 19));
        System.out.println(checkDeltaAge(employees, 18));
        System.out.println(getYoungestEmployee(employees));
    }

    public static ArrayList<Integer> ascendingInts(int min, int max) {
        ArrayList<Integer> integers = new ArrayList<>();
        while (min <= max) {
            integers.add(min);
            min++;
        }
        return integers;
    }
    
    public static int arraySum(ArrayList<Integer> integers) {
        int sum = 0;
        for (int i : integers) {
            if (i > 5) {
                sum += i;
            }
        }
        return sum;
    }

    public static void replaceArrayInts(ArrayList<Integer> integers, int number) {
        Collections.fill(integers, number);
    }

    public static void increaseArrayInts(ArrayList<Integer> integers, int number) {
        for (int i = 0; i != integers.size(); i++) {
            int value = integers.get(i);
            value += number;
            integers.set(i, value);
        }
    }

}

//    Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
//    Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст, и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
//    Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст, и проверяющий что средний возраст сотрудников превышает указанный аргумент;
//    Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.

//    Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
//    Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
//    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать каждую заполненную ячейку списка указанным числом;
//    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый элемент списка на указанное число;

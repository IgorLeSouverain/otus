package ru.braguntsov.java.basic.homeworks.homework9;

public class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

//    Создайте класс Сотрудник с полями: имя, возраст;

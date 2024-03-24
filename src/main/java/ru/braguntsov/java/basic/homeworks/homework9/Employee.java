package ru.braguntsov.java.basic.homeworks.homework9;

import java.util.ArrayList;

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

    public static ArrayList<String> getEmployeesNames(ArrayList<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    public static ArrayList<String> getEmployeesWithMinAge(ArrayList<Employee> employees, int age) {
        ArrayList<String> employeeArrayList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= age) {
                employeeArrayList.add(employee.getName());
            }
        }
        return employeeArrayList;
    }

    public static boolean checkDeltaAge(ArrayList<Employee> employees, int deltaAge) {
        int deltaAgeOfEmployees = 0;
        for (Employee employee : employees) {
            deltaAgeOfEmployees += employee.getAge();
        }
        deltaAgeOfEmployees = deltaAgeOfEmployees / employees.size();
        return deltaAgeOfEmployees > deltaAge;
    }

    public static Employee getYoungestEmployee(ArrayList<Employee> employees) {
        Employee employee = employees.get(0);
        for (Employee employee1 : employees) {
            if (employee.getAge() > employee1.getAge()) {
                employee = employee1;
            }
        }
        return employee;
    }

}

//    Создайте класс Сотрудник с полями: имя, возраст;

package ru.braguntsov.java.basic.homeworks.homework11;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Egor", Position.DEVELOPER, 1L);
        Person person1 = new Person("Anton", Position.BRANCH_DIRECTOR, 2L);
        Person person2 = new Person("Max", Position.SENIOR_MANAGER, 3L);
        Person person3 = new Person("Kim", Position.JUNIOR_DEVELOPER, 4L);
        Person person4 = new Person("Chen", Position.MANAGER, 5L);
        Person person5 = new Person("In", Position.DIRECTOR, 6L);

        Map<Long,Person> map = new HashMap<>();
        map.put(person.getId(), person);
        map.put(person1.getId(), person1);
        map.put(person2.getId(), person2);
        PersonDataBase personDataBase = new PersonDataBase(map);

        personDataBase.add(person3);
        personDataBase.add(person4);
        personDataBase.add(person5);
        System.out.println(personDataBase.findById(1L).getName());
        System.out.println(personDataBase.findById(5L).getName());
        System.out.println(personDataBase.isEmployee(1L));
        System.out.println(personDataBase.isEmployee(5L));
        System.out.println(personDataBase.isManager(person5));
        System.out.println(personDataBase.isManager(person1));
    }
}

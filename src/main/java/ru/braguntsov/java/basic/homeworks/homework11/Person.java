package ru.braguntsov.java.basic.homeworks.homework11;

public class Person {
    private final String name;
    private final Position position;
    private final Long id;

    public Person(String name, Position position, Long id) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public Long getId() {
        return id;
    }
}
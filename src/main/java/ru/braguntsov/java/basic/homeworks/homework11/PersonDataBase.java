package ru.braguntsov.java.basic.homeworks.homework11;

import java.util.Map;

public class PersonDataBase {
    private final Map<Long, Person> personList;

    public PersonDataBase(Map<Long, Person> personList) {
        this.personList = personList;
    }

    public Person findById(Long id) {
        return personList.get(id);
    }

    public void add(Person person) {
        personList.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        return person.getPosition().equals(Position.MANAGER) ||
                person.getPosition().equals(Position.DIRECTOR) ||
                person.getPosition().equals(Position.BRANCH_DIRECTOR) ||
                person.getPosition().equals(Position.SENIOR_MANAGER);
    }

    public boolean isEmployee(Long id) {
        Person person = findById(id);
        return !isManager(person);
    }
}

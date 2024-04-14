package ru.braguntsov.java.basic.homeworks.homework11;

import java.util.List;
import java.util.Objects;

public class PersonDataBase {
    private List<Person> personList;
    public PersonDataBase(List<Person> personList) {
        this.personList = personList;
    }

    public Person findById(Long id) {
        for (Person person : personList) {
            if (Objects.equals(id, person.getId())) {
                return person;
            }
        }
        return null;
    }

    public void add(Person person) {
        personList.add(person);
    }

    public boolean isManager(Person person) {
        return person.getPosition().equals(Position.MANAGER) ||
                person.getPosition().equals(Position.DIRECTOR) ||
                person.getPosition().equals(Position.BRANCH_DIRECTOR) ||
                person.getPosition().equals(Position.SENIOR_MANAGER);
    }

    public boolean isEmployee(Long id) {
        return !findById(id).getPosition().equals(Position.MANAGER) ||
                !findById(id).getPosition().equals(Position.MANAGER) ||
                !findById(id).getPosition().equals(Position.MANAGER) ||
                !findById(id).getPosition().equals(Position.MANAGER);
    }
}

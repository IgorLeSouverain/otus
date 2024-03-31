package ru.braguntsov.java.basic.homeworks.homework10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("12345678");
        numbers.add("12345690");
        numbers.add("12345689");
        phoneBook.add("Egor", numbers);
        System.out.println(phoneBook);
        System.out.println(phoneBook.containsPhoneNumber("12345689"));
    }
}
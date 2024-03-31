package ru.braguntsov.java.basic.homeworks.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook extends HashMap<String, ArrayList<String>> {

    public ArrayList<String> add(String fullName, ArrayList<String> telephoneNumber) {
        return super.put(fullName, telephoneNumber);
    }

    public ArrayList<String> find(String fullName) {
        return super.get(fullName);
    }

    public boolean containsPhoneNumber(String telephoneNumber) {
        for (Map.Entry<String, ArrayList<String>> entry : this.entrySet()) {
            for (String telephoneNumber1 : entry.getValue()) {
                if (telephoneNumber1.equals(telephoneNumber)) {
                    return true;
                }
            }
        }
        return false;
    }
}
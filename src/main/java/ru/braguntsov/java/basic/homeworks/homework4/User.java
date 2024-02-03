package ru.braguntsov.java.basic.homeworks.homework4;

import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class User {
    final private String surname;
    final private String name;
    final private String otchestvo;
    final private Date dob;
    final private String email;

    User(String surname, String name, String otchestvo, Date dob, String email) {
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
        this.dob = dob;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public Date getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }
}

class Main {
    public static void main(String[] args) {
        User[] users = {  // это родственники
                new User("braguntsov", "egor", "alekseevich", new GregorianCalendar(2001, Calendar.MAY, 29).getTime(), "braguntsov10gmail.com"),
                new User("braguntsov", "anton", "alekseevich", new GregorianCalendar(1980, Calendar.MAY, 29).getTime(), "braguntsov10gmail.com"),
                new User("braguntsov", "adolf", "alekseevich", new GregorianCalendar(1990, Calendar.MAY, 29).getTime(), "braguntsov10gmail.com"),
                new User("Муссолини", "Бенито", "alekseevich", new GregorianCalendar(1933, Calendar.MAY, 29).getTime(), "braguntsov10gmail.com"),
                new User("miyadzaki", "Hidetaka", "alekseevich", new GregorianCalendar(1966, Calendar.MAY, 29).getTime(), "braguntsov10gmail.com"),
                new User("herrington", "billy", "alekseevich", new GregorianCalendar(1956, Calendar.MAY, 29).getTime(), "braguntsov10gmail.com"),
                new User("braguntsov", "asd", "alekseevich", new GregorianCalendar(1999, Calendar.MAY, 29).getTime(), "braguntsov10gmail.com"),
                new User("braguntsov", "qwe", "alekseevich", new GregorianCalendar(1998, Calendar.MAY, 29).getTime(), "braguntsov10gmail.com"),
                new User("braguntsov", "zxc", "alekseevich", new GregorianCalendar(1997, Calendar.MAY, 29).getTime(), "braguntsov10gmail.com"),
                new User("braguntsov", "aaaa", "alekseevich", new GregorianCalendar(1996, Calendar.MAY, 29).getTime(), "braguntsov10gmail.com")
        };
        LocalDate nowDate = LocalDate.now();
        for (User user : users) {
            LocalDate userDate = LocalDate.fromDateFields(user.getDob());
            long yearsBetween = Years.yearsBetween(userDate, nowDate).getYears();
            if (yearsBetween > 40) {
                System.out.println(user.getName() + " старше 40 лет");
            }
        }
    }
}

//    Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
//        Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
//        В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
//        ФИО: фамилия имя отчество
//        Год рождения: год рождения
//        e-mail: email
//        В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью цикла выведите информацию только о пользователях старше 40 лет.

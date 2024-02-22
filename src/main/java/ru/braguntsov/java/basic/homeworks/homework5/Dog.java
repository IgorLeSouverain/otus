package ru.braguntsov.java.basic.homeworks.homework5;

public class Dog  extends Animal{

    public Dog(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }

    @Override
    public int swim(int distance) {
        int time = 0;
        while (endurance > 0) {
            info();
            System.out.printf("Remaining distance is %s \n", distance);
            distance -= runningSpeed;
            endurance = endurance - 2;
            time++;
        }
        if (distance > 0) {
            System.out.println("The animal is exhausted");
            return -1;
        }
        System.out.println("The animal finished the distance");
        return time;
    }
}

package ru.braguntsov.java.basic.homeworks.homework6;

public class Cat {
    private final String name;
    private boolean appetite;
    private boolean fullness;

    public Cat(String name) {
        this.name = name;
        this.fullness = false;
    }

    public void eat(Plate plate, int foodAmount) {
        if (plate.hasFood() && plate.getCurrentFood() >= foodAmount) {
            fullness = true;
            plate.decreaseFood(foodAmount);
            System.out.println("Кот " + name + " покушал");
        } else {
            System.out.println("В тарелке нет еды");
        }
    }

    public boolean isFull() {
        if (fullness) {
            System.out.println("Кот " + name + " сыт");
            return true;
        } else {
            System.out.println("Кот " + name + " не сыт");
            return false;
        }
    }
    public String getName() {
        return name;
    }
}

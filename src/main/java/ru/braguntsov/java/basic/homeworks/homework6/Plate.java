package ru.braguntsov.java.basic.homeworks.homework6;

public class Plate {
    private final int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void addFood(int foodAmount) {
        if (currentFood + foodAmount <= maxFood) {
            currentFood += foodAmount;
        } else {
            System.out.println("В тарелке не может быть больше максимума еды");
        }
    }

    public boolean decreaseFood(int foodAmount) {
        if (currentFood - foodAmount >= 0) {
            currentFood -= foodAmount;
            return true;
        } else {
            return false;
        }
    }

    public boolean hasFood() {
        return currentFood > 0;
    }

    public int getCurrentFood() {
        return currentFood;
    }
}

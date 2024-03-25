package ru.braguntsov.java.basic.homeworks.homework7;

public class Car implements Transport {
    private int petrolAmount;

    public Car(int petrolAmount) {
        this.petrolAmount = petrolAmount;
    }
    @Override
    public boolean move(Terrain terrain, int distance) {
        if (terrain.equals(Terrain.FOREST) || terrain.equals(Terrain.SWAMP)) {
            System.out.println("Невозможно проехать");
        } else {
            while (petrolAmount != 0) {
                System.out.println("Расстояние " + distance);
                if (distance == 0) {
                    System.out.println("Доехали");
                    return true;
                }
                distance--;
                petrolAmount--;
            }
            System.out.println("Бензин закончился");
        }
        return false;
    }
    @Override
    public String getName() {
        return "Машина";
    }
}

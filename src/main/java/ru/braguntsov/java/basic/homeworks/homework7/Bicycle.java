package ru.braguntsov.java.basic.homeworks.homework7;

public class Bicycle implements Transport {

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (terrain.equals(Terrain.SWAMP)) {
            System.out.println("Невозможно проехать");
        } else {
            while (distance != 0) {
                System.out.println("Расстояние " + distance);
                distance--;
            }
            System.out.println("Доехали");
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "Велосипед";
    }
}

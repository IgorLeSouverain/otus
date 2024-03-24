package ru.braguntsov.java.basic.homeworks.homework7;

public class Horse implements Transport {
    private int endurance;

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (terrain.equals(Terrain.SWAMP)) {
            System.out.println("Невозможно проехать");
        } else {
            while (endurance != 0) {
                System.out.println("Расстояние " + distance);
                if (distance == 0) {
                    System.out.println("Доехали");
                    return true;
                }
                distance--;
                endurance--;
            }
            System.out.println("Лошадь выдохлась");
        }
        return false;
    }
    @Override
    public String getName() {
        return "Лошадь";
    }
}

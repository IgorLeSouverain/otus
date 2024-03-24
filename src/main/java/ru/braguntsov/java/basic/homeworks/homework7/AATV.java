package ru.braguntsov.java.basic.homeworks.homework7;

public class AATV implements Transport{
    private int petrolAmount;

    public AATV(int petrolAmount) {
        this.petrolAmount = petrolAmount;
    }
    @Override
    public boolean move(Terrain terrain, int distance) {
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
        return false;
    }

    @Override
    public String getName() {
        return "Вездеход";
    }
}

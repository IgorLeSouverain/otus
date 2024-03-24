package ru.braguntsov.java.basic.homeworks.homework7;

public enum Terrain {
    FOREST("Лес"),
    PLAINS("Равнины"),
    SWAMP("Болото");

    private final String name;

    Terrain(String valueArg){
        name = valueArg;
    }

    public String getName() {
        return name;
    }
}
//    В приложении должны быть типы местности: густой лес, равнина, болото

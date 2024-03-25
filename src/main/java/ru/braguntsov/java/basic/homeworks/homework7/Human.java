package ru.braguntsov.java.basic.homeworks.homework7;

public class Human {
    private final String name;
    private Transport transport;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void removeTransport() {
        this.transport = null;
    }

    public boolean move(Terrain terrain, int distance) {
        if (transport != null) {
            System.out.println("Человек едет на транспорте " + transport.getName() + " местность - " + terrain.getName());
            return transport.move(terrain, distance);
        } else {
            System.out.println("Человек идет пешком, местность - " + terrain.getName());
            System.out.println("И куда-то пришел");
            return true;
        }
    }
}

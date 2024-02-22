package ru.braguntsov.java.basic.homeworks.homework5;

public abstract class Animal {
    protected final String name;
    protected final int runningSpeed;
    protected final int swimmingSpeed;
    protected int endurance;
    public Animal(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
    }

    public int run(int distance) {
        int time = 0;
        while (endurance > 0 && distance != 0) {
            info();
            System.out.printf("Remaining distance is %s \n", distance);
            distance -= runningSpeed;
            endurance--;
            time++;
        }
        if (distance > 0) {
            System.out.println("The animal is exhausted");
            return -1;
        }
        System.out.println("The animal finished the distance");
        return time;
    }

    public abstract int swim(int distance);
    public void info() {
        System.out.printf("The animal is running, remaining endurance is %s \n", endurance);
    }

}

//    Создайте классы Cat, Dog и Horse с наследованием от класса Animal
//        У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
//        Затраты выносливости:
//        Все животные на 1 метр бега тратят 1 ед выносливости,
//        Собаки на 1 метр плавания - 2 ед.
//        Лошади на 1 метр плавания тратят 4 единицы
//        Кот плавать не умеет.
//        Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное на указанное действие, и “понижать выносливость” животного. Если выносливости не хватает, то возвращаем время -1 и указываем что у животного появилось состояние усталости. При выполнении действий пишем сообщения в консоль.
//        Добавляем метод info(), который выводит в консоль состояние животного.
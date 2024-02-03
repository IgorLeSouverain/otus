package ru.braguntsov.java.basic.homeworks.homework4;

import java.util.HashMap;

public class Box {
    private final int width;
    private final int height;
    private final int depth;
    private String color;
    private Object object = null;
    private boolean isClosed = false;

    Box(int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
    }

    private boolean isClosed() {
        return isClosed;
    }

    public void closeBox() {
        if (!isClosed()) {
            isClosed = true;
            System.out.println("Box is now closed");
        }
    }

    public void openBox() {
        if (isClosed()) {
            isClosed = false;
            System.out.println("Box is now open");
        }
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Box color is now " + color);
    }

    public int getDepth() {
        System.out.println("Box's depth is " + depth);
        return depth;
    }

    public int getHeight() {
        System.out.println("Box's height is " + height);
        return height;
    }

    public int getWidth() {
        System.out.println("Box's width is " + width);
        return width;
    }

    private boolean hasObject() {
        return object != null;
    }

    public void setObject(Object o) {
        if (!hasObject() && !isClosed()) {
            object = o;
            System.out.println("You put " + o + " inside the box");
        } else {
            System.out.println("The box already has an object");
        }
    }

    public void removeObject() {
        if (hasObject() && !isClosed()) {
            System.out.println("You removed object from the box");
            object = null;
        }
    }

    public void getInfo() {
        HashMap<String, Object> hashMap = new HashMap<>();
        String color = this.color;
        int depth = this.depth;
        int height = this.height;
        int width = this.width;
        Object object = this.object;

        System.out.println("Box's color is " + color);
        System.out.println("Box's depth is " + depth);
        System.out.println("Box's height is " + height);
        System.out.println("Box's width is " + width);
        System.out.println("Box's object is " + object);
    }
    //  Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет. Коробку можно открывать и закрывать.
//  Коробку можно перекрашивать. Изменить размер коробки после создания нельзя. У коробки должен быть метод, печатающий информацию о ней в консоль.
//  В коробку можно складывать предмет (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть), только при условии что коробка открыта (предметом читаем просто строку). Выполнение методов должно сопровождаться выводом сообщений в консоль.
}

class Main1 {
    public static void main(String[] args) {
        Box box = new Box(1, 2, 3, "Red");
        box.setObject(1);
        box.getInfo();
        box.getDepth();
    }
}

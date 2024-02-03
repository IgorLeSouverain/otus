package ru.braguntsov.java.basic.homeworks.homework4;

import java.util.HashMap;

public class Box {
    private final int width;
    private final int height;
    private final int depth;
    private String color;
    private Object object = null;

    Box(int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
            System.out.println("Box color is now " + color);
        }
    }

    public String getColor() {
        if (color != null) {
            return color;
        } else {
            throw new NullPointerException("No color");
        }
    }

    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Object getObject() {
        if (object != null) {
            System.out.println("There's " + object + " inside the box");
            return object;
        } else {
            throw new NullPointerException("No object");
        }
    }

    public void setObject(Object o) throws Exception {
        if (object == null) {
            object = o;
            System.out.println("You put " + o + " inside the box");
        } else {
            throw new Exception("Box already has an item");
        }
    }

    public void removeObject() {
        if (object != null) {
            System.out.println("You removed object from the box");
            object = null;
        }
    }

    public HashMap<String, Object> getInfo() {
        HashMap<String, Object> hashMap = new HashMap<>();

        String color = this.color;
        int depth = this.depth;
        int height = this.height;
        int width = this.width;
        Object object = this.object;

        hashMap.put("color", color);
        hashMap.put("height", height);
        hashMap.put("depth", depth);
        hashMap.put("width", width);
        hashMap.put("object", object);

        return hashMap;
    }
    //  Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет. Коробку можно открывать и закрывать.
//  Коробку можно перекрашивать. Изменить размер коробки после создания нельзя. У коробки должен быть метод, печатающий информацию о ней в консоль.
//  В коробку можно складывать предмет (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть), только при условии что коробка открыта (предметом читаем просто строку). Выполнение методов должно сопровождаться выводом сообщений в консоль.
}

class Main1 {
    public static void main(String[] args) {
        Box box = new Box(1, 2, 3, "Red");
        try {
            box.setObject(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        box.getObject();
        System.out.println(box.getInfo());
    }
}

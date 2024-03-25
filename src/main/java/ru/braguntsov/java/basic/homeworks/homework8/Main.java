package ru.braguntsov.java.basic.homeworks.homework8;

public class Main {
    public static void main(String[] args) {
        String[][] strings = {{"1","2","3","4"},{"1","2","3","a"},{"1","2","3","4"},{"1","2","3","4"}};
        System.out.println(sumAllValuesInArray(strings));
    }

    public static int sumAllValuesInArray(String[][] stringsArray) {
        if (stringsArray.length == 4) {
            for (String[] firstDimension : stringsArray) {
                if (firstDimension.length != 4) {
                    throw new AppArraySizeException("У массива размер не 4х4");
                }
            }
        } else {
            throw new AppArraySizeException("У массива размер не 4х4");
        }
        int sum = 0;
        int index  = 0;
        for (String[] firstDimension : stringsArray) {
            for (String s : firstDimension) {
                try {
                    sum += Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("В ячейке " + index + " неверный тип данных");
                }
                index++;
            }
        }
        return sum;
    }
}


//    Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4. Если передан массив другого размера необходимо бросить исключение AppArraySizeException.

//    Метод должен обойти все элементы массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа),
//    должно быть брошено исключение AppArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

//    В методе main() необходимо вызвать полученный метод, обработать возможные исключения AppArraySizeException и AppArrayDataException и вывести результат расчета (сумму элементов,
//    при условии что подали на вход корректный массив).
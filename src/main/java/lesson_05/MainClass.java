package lesson_05;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    public static void taskOne() {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"How", "Are", "You"};
        swapTwoElementsInArray(intArray, 0, 2);
        System.out.println(Arrays.toString(intArray));
    }

    public static void taskTwo() {
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange());
        Box<Orange> orangeBox2 = new Box<>();
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());
        orangeBox.replaceFruitsToAnotherBox(orangeBox2);
        if (orangeBox2.compare(appleBox)) {
            System.out.println("Веса коробок равны.");
        } else {
            System.out.println("Коробки имеют разный вес.");
        }
    }

    private static void swapTwoElementsInArray(Object[] array, int firstPosition, int secondPosition) {
        if (firstPosition < 0 || firstPosition > array.length || secondPosition < 0 || secondPosition > array.length || firstPosition == secondPosition) {
            System.out.println("Неправильно указаны позиции элементов для замены");
        } else {
            Object temp = array[firstPosition];
            array[firstPosition] = array[secondPosition];
            array[secondPosition] = temp;
        }
    }
}

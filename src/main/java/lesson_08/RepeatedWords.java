package lesson_08;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedWords {
    public static void main(String[] args) {
        String[] strArray = {"Картошка", "Огурец", "Помидор", "Морковка", "Картошка", "Огурец", "Свекла", "Лук", "Чеснок", "Лук", "Лук"};

        vegCounting(strArray);
        System.out.println("Список без повторяющихся элементов:");
        System.out.println(uniqueWords(strArray));
    }

    public static Set<String> uniqueWords(String[] strArray) {
        return new HashSet<>(List.of(strArray));
    }

    public static void vegCounting(String[] strArray) {
        int potatoCount = 0;
        int cucumberCount = 0;
        int tomatoCount = 0;
        int carrotCount = 0;
        int beetCount = 0;
        int onionCount = 0;
        int garlicCount = 0;

        for (String str: strArray) {
            switch (str) {
                case "Картошка" -> potatoCount++;
                case "Огурец" -> cucumberCount++;
                case "Помидор" -> tomatoCount++;
                case "Морковка" -> carrotCount++;
                case "Свекла" -> beetCount++;
                case "Лук" -> onionCount++;
                case "Чеснок" -> garlicCount++;
            }
        }
        System.out.println("Список овощей и их количество в массиве:");
        System.out.println("Картошка: " + potatoCount);
        System.out.println("Огурец: " + cucumberCount);
        System.out.println("Помидор: " + tomatoCount);
        System.out.println("Морковка: " + carrotCount);
        System.out.println("Свекла: " + beetCount);
        System.out.println("Лук: " + onionCount);
        System.out.println("Чеснок: " + garlicCount);

    }
}

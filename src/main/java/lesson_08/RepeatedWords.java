package lesson_08;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedWords {
    public static void main(String[] args) {
        String[] strArray = {"��������", "������", "�������", "��������", "��������", "������", "������", "���", "������", "���", "���"};

        vegCounting(strArray);
        System.out.println("������ ��� ������������� ���������:");
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
                case "��������" -> potatoCount++;
                case "������" -> cucumberCount++;
                case "�������" -> tomatoCount++;
                case "��������" -> carrotCount++;
                case "������" -> beetCount++;
                case "���" -> onionCount++;
                case "������" -> garlicCount++;
            }
        }
        System.out.println("������ ������ � �� ���������� � �������:");
        System.out.println("��������: " + potatoCount);
        System.out.println("������: " + cucumberCount);
        System.out.println("�������: " + tomatoCount);
        System.out.println("��������: " + carrotCount);
        System.out.println("������: " + beetCount);
        System.out.println("���: " + onionCount);
        System.out.println("������: " + garlicCount);

    }
}

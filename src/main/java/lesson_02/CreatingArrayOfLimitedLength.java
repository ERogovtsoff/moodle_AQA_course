/*
Ќаписать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, кажда€ €чейка которого равна initialValue;
*/

package lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreatingArrayOfLimitedLength {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("¬ведите размерность массива: ");
        String inputLen = reader.readLine();
        int len = Integer.parseInt(inputLen);

        System.out.print("¬ведите число дл€ заполнени€ массива: ");
        String value = reader.readLine();
        int initialValue = Integer.parseInt(value);

        arrayCreating(len, initialValue);
    }

    public static int[] arrayCreating(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }

        return arr;
    }
}

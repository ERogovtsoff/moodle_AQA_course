/*
������ ������������� ������, ��������� �� ��������� 0 � 1. ��������: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. � ������� ����� � ������� �������� 0 �� 1, 1 �� 0;
*/

package lesson_02;

import org.apache.commons.lang3.RandomUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayConversion {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("������� ����������� �������: ");
        String num = reader.readLine();
        int intNum = Integer.parseInt(num);

        generateArray(intNum);
    }

    public static int[] generateArray(int arrSize) {
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = RandomUtils.nextInt(0, 2);
        }

        changingValues(arr);
        return arr;
    }

    public static int[] changingValues(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 1:
                    arr[i] = 0;
                    break;
                case 0:
                    arr[i] = 1;
                    break;
            }
        }
        return arr;
    }
}

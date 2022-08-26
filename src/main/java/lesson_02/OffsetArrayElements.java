package lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class OffsetArrayElements {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("¬ведите элементы массива через пробел: ");
        String arrStr = reader.readLine();
        String[] splitedArr = arrStr.split(" ");
        int[] intArr = new int[splitedArr.length];

        for (int i = 0; i < splitedArr.length; i++) {
            intArr[i] = parseInt(splitedArr[i]);
        }

        System.out.print("¬ведите число сдвига (может быть как положительным, так и отрицательным): ");
        int offset = parseInt(reader.readLine());

        offsetOfElements(intArr, offset);
    }

    public static int[] offsetOfElements(int arr[], int offset) {

        for (int i = 0, j = 0, k; i < arr.length; i++) {
            if (offset > 0) {
                if (i + offset > arr.length) {
                    arr[j] = arr[i];
                    do {
                        j++;
                    } while (j > offset);
                }
                arr[i] = arr[i+offset];

                System.out.print(arr[i] + " ");

            }
        }

        return arr;
    }

}

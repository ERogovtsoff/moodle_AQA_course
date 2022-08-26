/*
—оздать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). ќпределить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], Е, [n][n];
*/

package lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionalArray {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¬ведите размерность двумерного массива: ");
        String num = reader.readLine();
        int intNum = Integer.parseInt(num);

        arrayCreating(intNum);
    }

    public static int[][] arrayCreating(int num) {

        int[][] dArr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j || i + j == num - 1) {
                    dArr[i][j] = 1;
                } else {
                    dArr[i][j] = 0;
                }
                System.out.print(dArr[i][j] + " ");
            }
            System.out.println();
        }

        return dArr;
    }
}

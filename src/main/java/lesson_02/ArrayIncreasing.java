/*
Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
*/

package lesson_02;

public class ArrayIncreasing {

    public static void main(String[] args) {
        arrayIncrease();
    }

    public static int[] arrayIncrease() {
        int[] arr = arrayCreating();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }

        return arr;
    }

    public static int[] arrayCreating() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        return arr;
    }
}

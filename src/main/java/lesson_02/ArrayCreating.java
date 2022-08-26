/*
Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
*/

package lesson_02;


public class ArrayCreating {

    public static void main(String[] args){
        int arrSize = 100;
        int[] arr = new int[arrSize];
        arrayFilling(arr);
    }

    public static int[] arrayFilling(int[] arr) {

        for (int i = 0, j = 1; i < arr.length; i++) {
            arr[i] = j++;
        }

        return arr;
    }
}

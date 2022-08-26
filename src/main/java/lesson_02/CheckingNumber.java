/*
Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
*/

package lesson_02;

public class CheckingNumber {

    public static void main(String[] args) {
        positiveOrNegative(0);
    }

    public static void positiveOrNegative(int num) {
        if (num >= 0) {
            System.out.println("Число " + num + " положительное.");
        } else {
            System.out.println("Число " + num + " отрицательное.");
        }
    }
}

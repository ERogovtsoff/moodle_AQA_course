/*
Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.
*/

package lesson_02;

public class CheckingNumberReturnBoolean {

    public static void main(String[] args) {
        positiveOrNegative(-2);
    }

    public static boolean positiveOrNegative(int num) {
        boolean isNegative = false;

        if (num < 0) {
            isNegative = true;
        }

        return isNegative;
    }
}

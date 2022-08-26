/*
Ќаписать метод, принимающий на вход два целых числа и провер€ющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да Ц вернуть true, в противном случае Ц false.
*/

package lesson_02;

public class AmountInBetween {

    public static void main(String[] args) {
        interimAmount(5, 4);
    }

    public static boolean interimAmount(int num1, int num2) {
        int sum = num1 + num2;
        boolean isBetween = false;

        if (sum >= 10 && sum <= 20) {
            isBetween = true;
        }

        return isBetween;
    }
}

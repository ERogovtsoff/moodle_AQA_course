/*
�������� �����, ����������� �� ���� ��� ����� ����� � �����������, ��� �� ����� ����� � �������� �� 10 �� 20 (������������), ���� �� � ������� true, � ��������� ������ � false.
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

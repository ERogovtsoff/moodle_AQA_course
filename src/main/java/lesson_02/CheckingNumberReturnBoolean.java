/*
�������� �����, �������� � �������� ��������� ���������� ����� �����. ����� ������ ������� true, ���� ����� �������������, � ������� false ���� �������������. ���������: ���� ������� ������������� ������.
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

/*
�������� �����, ������� ����������, �������� �� ��� ����������, � ���������� boolean (���������� - true, �� ���������� - false). ������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� � ����������.
*/

package lesson_02;

public class LeapYear {

    public static void main(String[] args) {
        checkingYear(200); // ������������
        checkingYear(224); // ����������
        checkingYear(800); // ����������
    }

    public static boolean checkingYear(int year) {
        boolean isLeap = false;

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }
        return isLeap;
    }
}

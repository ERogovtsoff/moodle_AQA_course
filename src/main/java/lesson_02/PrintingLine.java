/*
�������� �����, �������� � �������� ���������� ���������� ������ � �����, ����� ������ ���������� � ������� ��������� ������, ��������� ���������� ���;
*/

package lesson_02;

public class PrintingLine {

    public static void main(String[] args) {
        multiplePrinting("mc.terracube.fun", 3);
    }

    public static void multiplePrinting(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
}

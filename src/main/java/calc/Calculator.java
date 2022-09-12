package calc;

import java.util.EmptyStackException;

public class Calculator {
    public double triangleSquareCalculate(int a, int b, int c) {
        try {
            Integer.parseInt(String.valueOf(a));
            Integer.parseInt(String.valueOf(b));
            Integer.parseInt(String.valueOf(c));
        } catch (NumberFormatException ex) {
            System.out.println("������� �� �����.");
        } catch (EmptyStackException e) {
            System.out.println("���� �� ����� �� �������");
        }

        if (a <= 0) {
            throw new ArithmeticException("����� a �� ����� ���� ������, ���� ����� 0");
        } else if (b <= 0) {
            throw new ArithmeticException("����� b �� ����� ���� ������, ���� ����� 0");
        } else if (c <= 0) {
            throw new ArithmeticException("����� c �� ����� ���� ������, ���� ����� 0");
        }

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        if (Double.isNaN(s) || Double.isInfinite(s) || s == 0) {
            throw new ArithmeticException("����� ����������� �� ����������!");
        }

        return s;
    }
}

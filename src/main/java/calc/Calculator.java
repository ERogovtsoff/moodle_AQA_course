package calc;

import java.util.EmptyStackException;

public class Calculator {
    public double triangleSquareCalculate(int a, int b, int c) {
        try {
            Integer.parseInt(String.valueOf(a));
            Integer.parseInt(String.valueOf(b));
            Integer.parseInt(String.valueOf(c));
        } catch (NumberFormatException ex) {
            System.out.println("Введено не число.");
        } catch (EmptyStackException e) {
            System.out.println("Одно из чисел не введено");
        }

        if (a <= 0) {
            throw new ArithmeticException("Число a не может быть меньше, либо равно 0");
        } else if (b <= 0) {
            throw new ArithmeticException("Число b не может быть меньше, либо равно 0");
        } else if (c <= 0) {
            throw new ArithmeticException("Число c не может быть меньше, либо равно 0");
        }

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        if (Double.isNaN(s) || Double.isInfinite(s) || s == 0) {
            throw new ArithmeticException("Такой треугольник не существует!");
        }

        return s;
    }
}

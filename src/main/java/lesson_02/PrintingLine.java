/*
Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
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

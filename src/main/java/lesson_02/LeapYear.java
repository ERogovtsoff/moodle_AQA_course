/*
Ќаписать метод, который определ€ет, €вл€етс€ ли год високосным, и возвращает boolean (високосный - true, не високосный - false).  аждый 4-й год €вл€етс€ високосным, кроме каждого 100-го, при этом каждый 400-й Ц високосный.
*/

package lesson_02;

public class LeapYear {

    public static void main(String[] args) {
        checkingYear(200); // Ќевисокосный
        checkingYear(224); // ¬исокосный
        checkingYear(800); // ¬исокосный
    }

    public static boolean checkingYear(int year) {
        boolean isLeap = false;

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }
        return isLeap;
    }
}

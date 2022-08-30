package lesson_06;

public class ExceptionApp {
    public static void main(String[] args) throws Exception {
        String[][] arr = new String[][]{{"1", "1", "gfd","1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        try {
            int result = arraySummary(arr);
            System.out.println(result);
        } catch (MyArrayDataException exception) {
            System.out.println("Некорректное значение массива!");
            System.out.println("Ошибка в ячейке: [" + exception.i + "][" + exception.j + "]");
        }
    }

    public static int arraySummary(String[][] strArr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (strArr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < strArr[i].length; j++) {
                try {
                    sum += Integer.parseInt(strArr[i][j]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}

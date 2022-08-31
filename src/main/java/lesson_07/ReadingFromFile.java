package lesson_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadingFromFile {
    /*public static int getStrCount(Scanner scanner) {
        int strCount = 0;
        System.out.println(scanner);
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            strCount++;
        }
        return strCount;
    }*/

    public static void main(String[] args) throws EmptyStackException, FileNotFoundException {
        String[] header = new String[0];
        // Добавить автоматическую генерацию многомерного массива в зависимости значений в файле
        int[][] data = new int[3][3];

        // Сепаратор используется, чтобы путь корректно отображался на всех ОС, так как на Windows используется "\", а, например, на Mac "/".
        // Актуально в случае, если путь до файла одинаковый
        String separator = File.separator;
        String path = "." + separator + "src" + separator + "main" + separator + "java" + separator + "lesson_07" + separator + "testFile.csv";
        File file = new File(path);

        Scanner scanner = new Scanner(file);

        try {
            header = scanner.nextLine().split(";");
        } catch (NoSuchElementException e) {
            System.out.println("Файл пуст!");
            scanner.close();
        } finally {
            System.out.println(Arrays.toString(header));
        }

        while (scanner.hasNextLine()) {
            int lineCounter = 0;
            String line = scanner.nextLine();
            String[] strLineArray = line.split(";");
            int[] numLineArray = new int[strLineArray.length];
            int counter = 0;

            for (String number : strLineArray) {
                // присвоение в многомерный массив работает некорректно
                data[lineCounter][counter] = Integer.parseInt(number);
                numLineArray[counter] = Integer.parseInt(number);
                counter++;
            }
            System.out.println(Arrays.toString(numLineArray));
            lineCounter++;
        }

        System.out.println(Arrays.deepToString(data));

       /* try {
            String line = scanner.nextLine();
            String[] strLineArray = line.split(";");
            int[] numLineArray = new int[strLineArray.length];
            int counter = 0;

            for (String number : strLineArray) {
                numLineArray[counter] = Integer.parseInt(number);
                counter++;
            }
            System.out.println(Arrays.toString(numLineArray));
        } catch (NoSuchElementException e) {
            System.out.println("Файл не имеет значений!");
        } finally {
            System.out.println(Arrays.deepToString(data));
            scanner.close();
        }*/

//        System.out.println(Arrays.toString(header));
        /*String[] header = new String[0];
        int[][] data = new int[][];*/



       /* while(scanner.hasNextLine()) {
            int counter = 0;

            if (header.length == 0) {
                String headerLine = scanner.nextLine();
                header = headerLine.split(";");
                System.out.println(Arrays.toString(header));
            }


            for (int i = 0, j = 0; i < scanner.nextLine().split(";").length; i++) {
                data[j][i] = Integer.parseInt(scanner.nextLine().split(";")[i]);
                System.out.print(data[j][i]);
            }

            String[] strNextLine = scanner.nextLine().split(";");

            for (int i = 0; i < strNextLine.length; i++) {
                data[counter][i] = Integer.parseInt(strNextLine[i]);
            }
            counter++;

            for (int i = 0; i < scanner.nextLine().split(";").length; i++) {
                data[counter][i] = Integer.parseInt(scanner.nextLine().split(";")[i]);
                System.out.print(data[counter][i]);
                counter++;
            }
            System.out.println();
        }*/
/*
        System.out.println(Arrays.deepToString(data));*/

    }
}

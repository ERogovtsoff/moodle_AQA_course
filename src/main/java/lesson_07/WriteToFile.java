package lesson_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/main/java/lesson_07/testFile.csv");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Value 1;Value 2;Value 3");
        pw.println("100;200;123");
        pw.println("300;400;500");

        pw.close();
    }
}

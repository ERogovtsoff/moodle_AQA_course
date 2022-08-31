package lesson_08;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();

    public void add(String phoneNumber, String lastName) {
        this.phoneBook.put(phoneNumber, lastName);
    }

    public int getBookSize() {
        return phoneBook.size();
    }

    public void get(String lastName) {
        Object[] keys = phoneBook.keySet().toArray(new String[0]);
        Object[] values = phoneBook.values().toArray(new String[0]);
        boolean isFound = false;

        System.out.println("Номера телефонов, соответствующие фамилии: " + lastName);
        for (int i = 0; i < keys.length; i++) {
            if (values[i] == lastName) {
                isFound = true;
                System.out.println(keys[i]);
            }
        }

        if (!isFound) {
            System.out.println("Проверьте правильность ввода фамилии!");
        }
    }

/*    public static void main(String[] args) throws IOException {
        Map<String, String> phoneBook = new HashMap<>();
        boolean isFromKeyboard = true;

        do {
            System.out.println("Введите номер телефона в международном формате: 7XXXXXXXXXX");
            BufferedReader phoneReader = new BufferedReader(new InputStreamReader(System.in));
            String phoneNumber = phoneReader.readLine();
            System.out.println("Введите фамилию держателя номера:");
            BufferedReader lastNameReader = new BufferedReader(new InputStreamReader(System.in));
            String lastName = lastNameReader.readLine();
            add(phoneNumber, lastName);
            System.out.println("Желаете добавить ещё одного пользователя?");
            System.out.println("Введите '1' чтобы продолжить ввод");
            System.out.println("Введите любой другой символ чтобы закончить ввод");
            BufferedReader continueReader = new BufferedReader(new InputStreamReader(System.in));
            int isContinue = Integer.parseInt(continueReader.readLine());
            if (isContinue != 1) {
                isFromKeyboard = false;
            }
        } while (isFromKeyboard);
    }

    public static Map<String, String> add(String phoneNumber, String lastName) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put(phoneNumber, lastName);

        return phoneBook;
    }*/
}

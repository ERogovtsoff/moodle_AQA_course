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

        System.out.println("������ ���������, ��������������� �������: " + lastName);
        for (int i = 0; i < keys.length; i++) {
            if (values[i] == lastName) {
                isFound = true;
                System.out.println(keys[i]);
            }
        }

        if (!isFound) {
            System.out.println("��������� ������������ ����� �������!");
        }
    }

/*    public static void main(String[] args) throws IOException {
        Map<String, String> phoneBook = new HashMap<>();
        boolean isFromKeyboard = true;

        do {
            System.out.println("������� ����� �������� � ������������� �������: 7XXXXXXXXXX");
            BufferedReader phoneReader = new BufferedReader(new InputStreamReader(System.in));
            String phoneNumber = phoneReader.readLine();
            System.out.println("������� ������� ��������� ������:");
            BufferedReader lastNameReader = new BufferedReader(new InputStreamReader(System.in));
            String lastName = lastNameReader.readLine();
            add(phoneNumber, lastName);
            System.out.println("������� �������� ��� ������ ������������?");
            System.out.println("������� '1' ����� ���������� ����");
            System.out.println("������� ����� ������ ������ ����� ��������� ����");
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

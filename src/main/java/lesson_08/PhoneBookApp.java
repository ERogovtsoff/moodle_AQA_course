package lesson_08;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("79385059006", "��������");
        phoneBook.add("375293669139", "��������");
        phoneBook.add("375295778530", "������");
        phoneBook.get("��������");
        phoneBook.get("������");
        phoneBook.get("������");
    }
}

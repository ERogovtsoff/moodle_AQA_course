package lesson_08;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("79385059006", "Роговцов");
        phoneBook.add("375293669139", "Роговцов");
        phoneBook.add("375295778530", "Ященко");
        phoneBook.get("Роговцов");
        phoneBook.get("Ященко");
        phoneBook.get("Иванов");
    }
}

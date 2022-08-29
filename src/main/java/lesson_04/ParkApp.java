package lesson_04;

public class ParkApp {
    public static void main(String[] args) {
        Park.Attraction att1 = new Park().new Attraction("Колесо обозрения",
                "10:00", "22:00", 600);
        System.out.println(att1.toString());
    }
}

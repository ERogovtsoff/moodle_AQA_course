package lesson_04;

public class PaymentApp {
    public static void main(String[] args) {
        Payment.Thing[] thingArray = new Payment.Thing[3];
        thingArray[0] = new Payment().new Thing("Молоко", 100, 200);
        thingArray[1] = new Payment().new Thing("Мясо", 400, 500);
        thingArray[2] = new Payment().new Thing("Хлеб", 80, 100);

        for (int i = 0; i < thingArray.length; i++) {
            System.out.println(thingArray[i].toString());
        }
    }
}

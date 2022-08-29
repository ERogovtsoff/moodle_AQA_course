// ������� ����� Park � ���������� �������, � ������� �������� �������� ����� ������� ���������� �� ������������, ������� �� ������ � ���������.

package lesson_04;

public class Park {

    public class Attraction {
        private String name;
        private String openingTime;
        private String closingTime;
        private int price;

        public Attraction(String name, String openingTime, String closingTime, int price) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", openingTime='" + openingTime + '\'' +
                    ", closingTime='" + closingTime + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}


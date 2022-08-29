// Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
// https://studfile.net/preview/4295220/

package lesson_04;

public class Payment {

    public class Thing {
        private String name;
        private int price;
        private int weight;

        public Thing(String name, int price, int weight) {
            this.name = name;
            this.price = price;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Thing{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", weight=" + weight +
                    '}';
        }
    }
}

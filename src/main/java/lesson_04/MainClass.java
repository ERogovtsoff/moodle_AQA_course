package lesson_04;

public class MainClass {
    public static void main(String[] args) {
        Cat[] catsArray = new Cat[5];
        Plate plate = new Plate(100);
        catsArray[0] = new Cat("Барсик", 15);
        catsArray[1] = new Cat("Алиса", 10);
        catsArray[2] = new Cat("Борис", 50);
        catsArray[3] = new Cat("Васька", 35);
        catsArray[4] = new Cat("Пётр", 32);

        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].eat(plate);
            if (catsArray[i].isFull()) {
                System.out.println("Кот " + catsArray[i].getName() + " покушал.");
            } else {
                System.out.println("Кот " + catsArray[i].getName() + " остался голодным:(");
            }
        }

        plate.info();
    }
}

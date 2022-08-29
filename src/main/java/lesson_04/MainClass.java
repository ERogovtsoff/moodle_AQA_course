package lesson_04;

public class MainClass {
    public static void main(String[] args) {
        Cat[] catsArray = new Cat[5];
        Plate plate = new Plate(100);
        catsArray[0] = new Cat("������", 15);
        catsArray[1] = new Cat("�����", 10);
        catsArray[2] = new Cat("�����", 50);
        catsArray[3] = new Cat("������", 35);
        catsArray[4] = new Cat("ϸ��", 32);

        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].eat(plate);
            if (catsArray[i].isFull()) {
                System.out.println("��� " + catsArray[i].getName() + " �������.");
            } else {
                System.out.println("��� " + catsArray[i].getName() + " ������� ��������:(");
            }
        }

        plate.info();
    }
}

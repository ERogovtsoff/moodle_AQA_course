package lesson_04;

public class Dog extends Animal{
    private String name;
    private int runLimit = 500;
    private int swigLimit = 10;
    private static int count;

    public Dog(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    void run(int range) {
        if (range <= this.runLimit) {
            System.out.println(this.name + " �������� " + range + " �.");
        } else {
            System.out.println(this.name + " �� �������� ��������� ����� ����������!");
        }
    }

    @Override
    void swim(int range) {
        if (range <= this.swigLimit) {
            System.out.println(this.name + " ������� " + range + " �.");
        } else {
            System.out.println(this.name + " �� �������� �������� ����� ����������!");
        }
    }
}

package lesson_04;

public class Cat extends Animal{
    private String name;
    private int appetite;
    private int runLimit = 200;
    private static int count;
    private boolean isFull = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        count++;
    }

    public void eat(Plate p) {
        isFull = p.decreaseFood(appetite);
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    @Override
    void run(int range) {
        if (range <= this.runLimit) {
            System.out.println(this.name + " пробежал " + range + " м.");
        } else {
            System.out.println(this.name + " не способен пробежать такое расстояние!");
        }
    }

    @Override
    void swim(int range) {
        System.out.println(this.name + " не умеет плавать!");
    }
}

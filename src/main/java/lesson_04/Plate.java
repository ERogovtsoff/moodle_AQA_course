package lesson_04;

public class Plate {
    private int food;
    private boolean isDecreased = false;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood (int n) {
        if (n <= food) {
            food -= n;
            isDecreased = true;
        } else {
            isDecreased = false;
        }

        return isDecreased;
    }

    public void increaseFood (int n) {
        food += n;
    }

    public void info() {
        System.out.println("В тарелке осталось: " + food);
    }
}

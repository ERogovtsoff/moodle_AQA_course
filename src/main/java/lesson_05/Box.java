package lesson_05;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    ArrayList<T> fruitBox = new ArrayList();

    public Box(T... fruits) {
        fruitBox = new ArrayList<>(Arrays.asList(fruits));
    }

    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }

    public void addFruit(T fruit) {
        fruitBox.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (int i = 0; i < fruitBox.size(); i++) {
            totalWeight += fruitBox.get(i).getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<? extends Fruit> boxWithSomething) {
        return Math.abs(this.getWeight() - boxWithSomething.getWeight()) < 0.0001f;
    }

    public void replaceFruitsToAnotherBox(Box<T> anotherBox) {
        anotherBox.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }
}

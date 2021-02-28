package Homework11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Box<T extends Fruit> {

    private final List<T> placeInBox;
    private int capacity;

    @SafeVarargs
    public Box(int capacity, T... fruits) {
        this.placeInBox = new ArrayList<>(Arrays.asList(fruits));
        this.capacity = capacity;
    }

    public void addFruit(T fruit) {
        if (capacity > 0) {
            placeInBox.add(fruit);
            capacity--;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : placeInBox) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void movingFruits(Box<T> anBox) {
        if (anBox == this) return;
        int countSize = Math.min(placeInBox.size(), anBox.capacity);
        List<T> fruits = placeInBox.subList(0, countSize);
        anBox.placeInBox.addAll(fruits);
        placeInBox.removeAll(fruits);
        anBox.capacity -= countSize;
        capacity += countSize;

    }

    public boolean boxCompare(Box<?> anBox) {
        return Math.abs(this.getWeight() - anBox.getWeight()) < 0.01;
    }
}

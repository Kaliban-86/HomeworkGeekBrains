package Homework6;

public abstract class Animal {
    String name = "Какой-то кот или пес";
    int maxDistanceToRun;
    int maxDistanceToSwim;

    Animal(int maxDistanceToRun, int MaxDistanceToSwim) {
        this.maxDistanceToRun = maxDistanceToRun;
        this.maxDistanceToSwim = MaxDistanceToSwim;

    }

    public abstract void run(int distanceToOvercome);

    public abstract void swim(int distanceToOvercome);
}

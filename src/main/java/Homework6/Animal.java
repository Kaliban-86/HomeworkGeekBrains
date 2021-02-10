package Homework6;

abstract class Animal {
    String name = "Какой-то кот или пес";
    int maxDistanceToRun;
    int maxDistanceToSwim;

    Animal(int maxDistanceToRun, int MaxDistanceToSwim) {
        this.maxDistanceToRun = maxDistanceToRun;
        this.maxDistanceToSwim = MaxDistanceToSwim;

    }

    abstract void run(int distanceToOvercome);

    abstract void swim(int distanceToOvercome);
}

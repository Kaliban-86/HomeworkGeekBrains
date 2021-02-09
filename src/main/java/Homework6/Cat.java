package Homework6;

public class Cat extends Animal {

    Cat(int maxDistanceToRun, int MaxDistanceToSwim) {
        super(maxDistanceToRun, MaxDistanceToSwim);
        name = "Барсик";

    }

    @Override
    public void run(int distanceToOvercome) {
        if (maxDistanceToRun >= distanceToOvercome) {
            System.out.println(name + " пробежал " + distanceToOvercome + " метров");
        } else {
            System.out.println(name + " пробежал " + maxDistanceToRun + " метров и устал...");
        }

    }

    @Override
    public void swim(int distanceToOvercome) {
        if (maxDistanceToSwim == 0) {
            System.out.println(name + " не умеет плавать...");
        } else if (maxDistanceToSwim >= distanceToOvercome) {
            System.out.println(name + " проплыл " + distanceToOvercome + " метров");
        } else {
            System.out.println(name + " проплыл " + maxDistanceToSwim + " метров и устал...");
        }

    }
}

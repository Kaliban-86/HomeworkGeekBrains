package Poligon;

import Homework6.Animal;

public class Cat2 extends Animal2 {
    Cat2(String name, int maxDistanceTraveled){
        super(name,maxDistanceTraveled);
        this.name = name;
        this.maxDistanceTraveled =maxDistanceTraveled  ;

    }
    @Override
    public void run(int distance){
        if (distance <= maxDistanceTraveled){
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " пробежал " + maxDistanceTraveled + " метров и устал...");
        }

    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать...");
    }
}

package Poligon;

public abstract class Animal2 {
    String name;
    int maxDistanceTraveled;

    Animal2(String name, int maxDistanceTraveled){
        this.name = name;
        this.maxDistanceTraveled = maxDistanceTraveled;

    }
    public abstract void run(int distance);

    public abstract void swim(int distance);

}

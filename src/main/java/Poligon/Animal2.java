package Poligon;

public class Animal2 {
    String name;
    int maxDistanceTraveled;

    Animal2(String name, int maxDistanceTraveled){
        this.name = name;
        this.maxDistanceTraveled = maxDistanceTraveled;

    }
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " метров");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " метров");
    }

}

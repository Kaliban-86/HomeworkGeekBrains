package Poligon;

public class Eva extends Cat2{
    final int MAX_TO_RUN = 500;

    Eva(String name, int maxDistanceTraveled) {
        super(name, maxDistanceTraveled);

    }
    public void swim(int distance){
        System.out.println(name + " проплыла " + distance + " метров...");
    }
}

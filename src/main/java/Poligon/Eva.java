package Poligon;

public class Eva extends Cat2{
    final int MAX_TO_RUN = 500;

    Eva(int maxDistanceTraveled) {
        super(maxDistanceTraveled);
        name = "Eva";
    }
    public void swim(int distance){
        System.out.println(name + " проплыла " + distance + " метров...");
    }
}

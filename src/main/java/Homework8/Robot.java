package Homework8;

public class Robot {
    String name;

    Robot(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }
}

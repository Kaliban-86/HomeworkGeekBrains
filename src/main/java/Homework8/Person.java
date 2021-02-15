package Homework8;

public class Person {
    String name;
    int maxRunningDistance;

    Person(String name, int maxRunningDistance) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
    }

    public void run(Treadmill treadmill) {
        if (maxRunningDistance >= treadmill.trackLenght) {
            System.out.println(name + " пробежал " + treadmill.trackLenght + " метров!");
        } else {
            System.out.println(name + " не смог пробежать " + treadmill.trackLenght + " метров!");
        }

    }

    public void jump() {
        System.out.println(name + " прыгает");
    }


}

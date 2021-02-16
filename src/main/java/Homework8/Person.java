package Homework8;

public class Person implements Moving {
    String name;
    int maxRunningDistance;
    int maxJumpHeight;

    Person(String name, int maxRunningDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(Treadmill treadmill) {
        if (maxRunningDistance >= treadmill.trackLenght) {
            System.out.println(name + " успешно пробежал " + treadmill.trackLenght + " метров!");
        } else {
            System.out.println(name + " не смог пробежать " + treadmill.trackLenght + " метров!");
        }

    }

    public void jump(Wall wall) {
        if (maxJumpHeight >= wall.hight) {
            System.out.println(name + " успешно перепрыгнул " + wall.hight + " метров!");
        } else {
            System.out.println(name + " не смог перепрыгнуть " + wall.hight + " метров!");
        }

    }

}

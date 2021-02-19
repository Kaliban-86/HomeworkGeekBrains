package Homework8;

public class Cat implements Moving {
    String name;
    int maxRunningDistance;
    int maxJumpHeight;

    Cat(String name, int maxRunningDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public boolean run(Treadmill treadmill) {
        if (maxRunningDistance >= treadmill.trackLenght) {
            System.out.println(name + " успешно пробежал " + treadmill.trackLenght + " метров!");
            return true;
        } else {
            System.out.println(name + " не смог пробежать " + treadmill.trackLenght + " метров!");
            return false;
        }

    }

    public boolean jump(Wall wall) {
        if (maxJumpHeight >= wall.hight) {
            System.out.println(name + " успешно перепрыгнул " + wall.hight + " метров!");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть " + wall.hight + " метров!");
            return false;
        }

    }
}

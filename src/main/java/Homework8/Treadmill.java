package Homework8;

public class Treadmill {
    int trackLenght;

    Treadmill(int trackLenght) {
        this.trackLenght = trackLenght;
    }

    public void run(Person person) {
        if (trackLenght <= person.maxRunningDistance) {
            System.out.println(person.name + " успешно пробежал " + trackLenght + " метров!");
        } else {
            System.out.println(person.name + " не смог пробежать " + trackLenght + " метров!");
        }

    }

    public void run(Robot robot) {
        if (trackLenght <= robot.maxRunningDistance) {
            System.out.println(robot.name + " успешно пробежал " + trackLenght + " метров!");
        } else {
            System.out.println(robot.name + " не смог пробежать " + trackLenght + " метров!");
        }

    }

    public void run(Cat cat) {
        if (trackLenght <= cat.maxRunningDistance) {
            System.out.println(cat.name + " успешно пробежал " + trackLenght + " метров!");
        } else {
            System.out.println(cat.name + " не смог пробежать " + trackLenght + " метров!");
        }

    }
}

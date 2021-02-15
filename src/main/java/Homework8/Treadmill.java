package Homework8;

public class Treadmill {
    int trackLenght;

    Treadmill(int trackLenght) {
        this.trackLenght = trackLenght;
    }

    public void run (Person person) {
        if (trackLenght <= person.maxRunningDistance) {
            System.out.println(person.name + " успешно пробежал " + trackLenght + " метров!");
        } else {
            System.out.println(person.name + " не смог пробежать " + trackLenght + " метров!");
        }

    }
}

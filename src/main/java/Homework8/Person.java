package Homework8;

public class Person {
    String name;
    int maxRunningDistance;
    int maxJumpHeight;

    Person(String name, int maxRunningDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    Person(String name, int maxRunningDistance){
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
    }

}

package Homework6;

public class Dog extends Animal{

    Dog(String name){
        this.name = name;
    }
    @Override
    public void swim(int distance) {
        if (distance > 10){
            System.out.println(name + " проплыл 10 метров  и утонул((((");
        } else System.out.println(name + " пробежал " + distance + " метров");
        ;
    }
}

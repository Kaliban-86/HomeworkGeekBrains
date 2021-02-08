package Homework6;

public class Dog extends Animal{

    Dog(String name){
        this.name = name;
    }
    @Override
    public void run(int distance){
        if (distance <= 500){
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " пробежал " + 500 + " метров и устал...");
        }

    }
    public void swim(int distance) {
        if (distance > 10){
            System.out.println(name + " проплыл 10 метров и устал...");
        } else System.out.println(name + " проплыл " + distance + " метров");
        ;
    }
}

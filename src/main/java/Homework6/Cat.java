package Homework6;

public class Cat extends Animal{
    Cat (String name){
        this.name = name;
    }
    @Override
    public void run(int distance){
        if (distance <= 200){
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " пробежал " + 200 + " метров и устал...");
        }

    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать...");
    }
}

package Homework6;

public class Cat extends Animal{
    Cat (String name){
        this.name = name;
    }
    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }
}

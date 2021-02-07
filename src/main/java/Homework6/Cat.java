package Homework6;

public class Cat extends Animal{
    @Override
    public void swim(int distance) {
        System.out.println("кошка не умеет плавать" + distance);
    }
}

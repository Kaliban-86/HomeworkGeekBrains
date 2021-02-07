package Homework6;

public class Dog extends Animal{
    @Override
    public void swim(int distance) {
        if (distance > 10){
            System.out.println("собака проплыла 10 метров  и утонула((((");
        } else System.out.println("собака пробежала" + distance);
        ;
    }
}

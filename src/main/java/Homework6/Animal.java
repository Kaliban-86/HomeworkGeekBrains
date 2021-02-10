package Homework6;

 abstract class Animal {
     String name = "Какой-то кот или пес";
    int maxDistanceToRun;
    int maxDistanceToSwim;

     abstract void run(int distanceToOvercome);

     abstract void swim(int distanceToOvercome);

}

package Homework6;

 abstract class Animal {
     String name = "Животное";
    int maxDistanceToRun;
    int maxDistanceToSwim;

     abstract void run(int distanceToOvercome);

     abstract void swim(int distanceToOvercome);

}

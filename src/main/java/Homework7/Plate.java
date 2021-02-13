package Homework7;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("В тарелке: " + food + " котлет");
    }

    public void addFoodToPlate(int additive){
        food = food + additive;
        System.out.println("В тарелку добавлено " + additive + " котлет");
    }

}

package Homework7;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (n > food){
            System.out.println("Недостаточно еды для этого кота(((");
        } else
        food -= n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFoodToPlate(int additive){
        food = food + additive;
        System.out.println("В тарелку добавлено " + additive + " порций еды");
    }

}

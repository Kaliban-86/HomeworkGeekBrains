package Homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (appetite <= plate.food) {
            satiety = true;
            plate.decreaseFood(appetite);
        } else satiety = false;


    }

    public void satietyInfo() {
        if (satiety) {
            System.out.println(name + " скушал " + appetite + " котлет и наелся!");
        } else System.out.println("В тарелке недостаточно котлет для " + name + "а!");
    }
}

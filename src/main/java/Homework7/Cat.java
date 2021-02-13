package Homework7;

import java.util.Random;

public class Cat {
    public static Random rand = new Random();
    private final String name;
    private final int appetite;
    private boolean satiety = false;

    public Cat(String name) {
        this.name = name;
        appetite = (rand.nextInt(10) + 1);
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

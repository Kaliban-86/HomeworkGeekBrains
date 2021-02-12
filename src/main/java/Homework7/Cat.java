package Homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate pl) {
        if (appetite <= pl.food){
            satiety=true;

        }
        pl.decreaseFood(appetite);

    }
    public void satietyInfo () {
        if (satiety) {
            System.out.println(name + " хватило еды и он сыт!");
        } else System.out.println(name + " не хватило еды!");
    }
}

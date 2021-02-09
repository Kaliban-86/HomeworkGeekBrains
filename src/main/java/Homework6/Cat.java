package Homework6;

public class Cat extends Animal {

    Cat(int maxDistanceToRun, int maxDistanceToSwim, String name) {
        super(maxDistanceToRun, maxDistanceToSwim);
        this.name = name;
        name = "Барсик";
    }

    @Override
    public void run(int distanceToOvercome) {

        if (getMaxDistanceToRun() == 0) {
            System.out.println(getName() + "  не умеет, но скорее не хочет, бегать... ");
        } else if (getMaxDistanceToRun() > distanceToOvercome) {
            System.out.println(getName() + " пробежал " + distanceToOvercome + " метров и еще с удовольствием пробежит " + (getMaxDistanceToRun() - distanceToOvercome));
        } else if (getMaxDistanceToRun() == distanceToOvercome) {
            System.out.println(getName() + " пробежал " + distanceToOvercome + " метров");
        } else {
            System.out.println(getName() + " пробежал " + getMaxDistanceToRun() + " метров и устал...");
        }

    }

    @Override
    public void swim(int distanceToOvercome) {

        if (getMaxDistanceToSwim() == 0) {
            System.out.println(getName() + " не умеет плавать...");
        } else if (getMaxDistanceToSwim() > distanceToOvercome) {
            System.out.println(getName() + " проплыл " + distanceToOvercome + " метров и еще с удовольствием проплывет " + (getMaxDistanceToSwim() - distanceToOvercome));
        } else if (getMaxDistanceToSwim() == distanceToOvercome){
            System.out.println(getName() + " проплыл " + distanceToOvercome + " метров");
        }

        else if (getMaxDistanceToSwim() > 0) {
            System.out.println(getName() + " проплыл " + getMaxDistanceToSwim() + " метров и устал...");
        }

    }

    public int getMaxDistanceToSwim() {
        if (maxDistanceToSwim >= 0) {
            return maxDistanceToSwim;
        } else
            System.out.print(getName() + " не знаком с творчеством Кристофера Нолана, в связи с чем не имеет реверсивных способностей!!! Ну или просто ");
        return 0;
    }

    public int getMaxDistanceToRun() {
        if (maxDistanceToRun >= 0) {
            return maxDistanceToRun;
        } else
            System.out.print(getName() + " не знаком с творчеством Кристофера Нолана, в связи с чем не имеет реверсивных способностей!!! Ну или просто ");
        return 0;
    }
    public String getName(){
        return name;
    }
}

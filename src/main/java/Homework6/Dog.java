package Homework6;

class Dog extends Animal {

    Dog(String name) {
        this.name = name;
        maxDistanceToRun = 500;
        maxDistanceToSwim = 10;
    }

    @Override
    void run(int distanceToOvercome) {

        if (getMaxDistanceToRun() == 0) {
            System.out.println(name + "  не умеет, но скорее не хочет, бегать... ");
        } else if (getMaxDistanceToRun() > distanceToOvercome) {
            System.out.println(name + " пробежал " + distanceToOvercome + " метров и еще с удовольствием пробежит " + (getMaxDistanceToRun() - distanceToOvercome));
        } else if (getMaxDistanceToRun() == distanceToOvercome) {
            System.out.println(name + " пробежал " + distanceToOvercome + " метров");
        } else {
            System.out.println(name + " пробежал " + getMaxDistanceToRun() + " метров и устал...");
        }

    }

    @Override
    void swim(int distanceToOvercome) {

        if (getMaxDistanceToSwim() == 0) {
            System.out.println(name + " не умеет плавать...");
        } else if (getMaxDistanceToSwim() > distanceToOvercome) {
            System.out.println(name + " проплыл " + distanceToOvercome + " метров и еще с удовольствием проплывет " + (getMaxDistanceToSwim() - distanceToOvercome));
        } else if (getMaxDistanceToSwim() == distanceToOvercome) {
            System.out.println(name + " проплыл " + distanceToOvercome + " метров");
        } else if (getMaxDistanceToSwim() > 0) {
            System.out.println(name + " проплыл " + getMaxDistanceToSwim() + " метров и устал...");
        }

    }

    int getMaxDistanceToSwim() {
        if (maxDistanceToSwim >= 0) {
            return maxDistanceToSwim;
        } else
            System.out.print(name + " не знаком с творчеством Кристофера Нолана, в связи с чем не имеет реверсивных способностей!!! Ну или просто ");
        return 0;
    }

    int getMaxDistanceToRun() {
        if (maxDistanceToRun >= 0) {
            return maxDistanceToRun;
        } else
            System.out.print(name + " не знаком с творчеством Кристофера Нолана, в связи с чем не имеет реверсивных способностей!!! Ну или просто ");
        return 0;
    }
}

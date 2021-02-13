package Homework7;

//        +Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//        +Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//        +Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//        +Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//        +Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

public class Homework7 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Plate plate = new Plate(10);

        Plate plateForCats = new Plate(100);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Джек");
        cats[2] = new Cat("Корт");
        cats[3] = new Cat("Борис");
        cats[4] = new Cat("Геральт");

        plate.info();
        cat1.eat(plate);
        cat1.satietyInfo();
        plate.info();
        plate.addFoodToPlate(20);
        cat2.eat(plate);
        cat2.satietyInfo();
        plate.addFoodToPlate(5);
        cat2.eat(plate);
        cat2.satietyInfo();
        plate.info();

        System.out.println();
        System.out.println("А теперь покормим котов соседки!!!");
        System.out.println();

        catsEating(cats,plateForCats);

    }

    public static void catsEating(Cat[] cats, Plate plate){
        for (Cat oneOfTheCats : cats) {
            oneOfTheCats.eat(plate);
        }
        for (Cat oneOfTheCats : cats) {
            oneOfTheCats.satietyInfo();
        }
    }
}

package Homework8;
//        +Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь
//                  бегать и прыгать (методы просто выводят информацию о действии в консоль).
//        +Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
//        соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал,
//        не смог пробежать и т.д.).
//        Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//        * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//        Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

public class Homework8 {
    public static void main(String[] args) {
        Person person = new Person("Арсен", 500, 5);
        Robot robot = new Robot("Robocop", 100, 10);
        Cat cat = new Cat("Мурзик", 100, 2);

        Treadmill treadmill = new Treadmill(250);
        Wall wall = new Wall(6);

        Moving[] participants = new Moving[6];

        participants[0] = new Person("Майк", 300, 1);
        participants[1] = new Robot("Красная Королева", 400, 3);
        participants[2] = new Cat("Томас", 150, 1);
        participants[3] = new Person("Сергей", 500, 2);
        participants[4] = new Robot("Вижин", 450, 4);
        participants[5] = new Cat("Барсик", 200,2);

        holdingACompetition(participants,treadmill);

    }
    public static void holdingACompetition (Moving[] participants,Treadmill treadmill){
        participants[0].run(treadmill);
        participants[1].run(treadmill);
        participants[2].run(treadmill);
        participants[3].run(treadmill);
        participants[4].run(treadmill);
        participants[5].run(treadmill);

    }
}

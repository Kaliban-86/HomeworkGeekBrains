package Poligon;
import Homework6.Cat;

//        Создать классы Собака и Кот с наследованием от класса Животное.
//        Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//        У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//        * Добавить подсчет созданных котов, собак и животных.
//        конкретные значения (по огранияениям) передавать в конструкторе каждого животного
//          методы бежать и плыть - абстрактные методы.
//         переопределение полей из родительского класса в наследниках

public class Poligon {
    public static void main(String[] args) {
        Cat2 cat = new Cat2("Барсик",200);
        cat.run(100);
        Eva eva = new Eva("Ева",100);
        eva.run(70);
    }
}
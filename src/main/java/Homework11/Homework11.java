package Homework11;

//        + Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
//        + Написать метод, который преобразует массив в ArrayList;
//                                                                 Задача:
//        + Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//        + Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку
//          нельзя сложить и яблоки, и апельсины;
//        +  Для хранения фруктов внутри коробки можно использовать ArrayList;
//        +  Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
//           вес яблока – 1.0f,апельсина – 1.5f (единицы измерения не важны);
//
//        + Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут
//          в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать
//          коробки с яблоками и апельсинами;
//        + Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов:
//          нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую
//          перекидываются объекты, которые были в первой;
//        + Не забываем про метод добавления фрукта в коробку.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework11 {
    public static void main(String[] args) {

        String[] testMethodArr = new String[]{"Мама", "Папа", "Сын", "Брат", "Дочь", "Дядя", "Внук"};
        System.out.println(Arrays.toString(testMethodArr));

        arrElementRotation(testMethodArr, 1, 7);

        System.out.println(Arrays.toString(testMethodArr));

        System.out.println(convertingArrToList(testMethodArr));

        Box<Apple> appleBox1 = new Box<Apple>(3, new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<Orange>(10);
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес коробки с апельсинами: "+ orangeBox.getWeight() + " осталось места для " + orangeBox.getCapacity() + " апельсинов");
        System.out.println("Вес коробки с яблаками: "+ appleBox1.getWeight());

        Box<Apple> appleBox2 = new Box<Apple>(10);
        appleBox1.movingFruits(appleBox2);
        System.out.println(appleBox2.getWeight());
        System.out.println(appleBox1.getWeight());

        System.out.println(orangeBox.boxCompare(appleBox2));


    }

    public static <T> void arrElementRotation(T[] arr, int numOfFirstRotElement, int numOfSecondRotElement) {
        T tempVar = arr[numOfFirstRotElement - 1];
        arr[numOfFirstRotElement - 1] = arr[numOfSecondRotElement - 1];
        arr[numOfSecondRotElement - 1] = tempVar;
        // сдвиг влево на 1 - для удобства пользователей.
    }

    public static <T> ArrayList<T> convertingArrToList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}


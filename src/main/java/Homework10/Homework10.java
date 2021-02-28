package Homework10;
//        + Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//        + Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//        + Посчитать, сколько раз встречается каждое слово.

//        + Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
//        + В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать
//          номер телефона по фамилии.
//        + Следует учесть, что под одной фамилией может быть несколько телефонов
//          (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не
//          добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
//          через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.

import java.util.*;

public class Homework10 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Танк");
        words.add("Хлеб");
        words.add("Роса");
        words.add("Луна");
        words.add("Танк");
        words.add("Смех");
        words.add("Реинкорнация");
        words.add("Программирование");
        words.add("Луна");
        words.add("Веселье");
        words.add("Дружба");
        words.add("Снег");
        words.add("Роса");
        words.add("Танк");

        Set<String> uniqueElementsOfList = new LinkedHashSet<>(words);
        System.out.println(uniqueElementsOfList);

        Map<String, Integer> counts = new HashMap<>();
        for (String str : words) {
            if (counts.containsKey(str)) {
                counts.put(str, counts.get(str) + 1); // 1 - первоначальное значение счетчика повторений слов.
            } else {
                counts.put(str, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println();

        Phonebook inRussia = new Phonebook();
        inRussia.add("Иванов", 54561789);
        inRussia.add("Петров", 67892314);
        inRussia.add("Иванов", 98209177);
        inRussia.add("Сидоров", 98209177);

        inRussia.get("ИВАНОВ");
        inRussia.get("петров");
        inRussia.get("Сидоров");

        // Справочник не расчитан, на ввод фамилий которые в нем отсутствуют, но этого и не было в задании!

    }
}

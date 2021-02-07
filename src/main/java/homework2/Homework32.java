package ru.geekbrains.homework2;

//* Создать массив из слов
// String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
// "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
// "pineapple", "pumpkin", "potato"}.
// При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным
// словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые
// стоят на своих местах.
// apple – загаданное
// apricot - ответ игрока
// ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
// Для сравнения двух слов посимвольно можно пользоваться:
// String str = "apple";
// char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
// Играем до тех пор, пока игрок не отгадает слово.
// Используем только маленькие буквы.

import java.util.Scanner;

public class Homework32 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String word = riddleWord();
        System.out.println(word);// Временно для проверки правильности.
        System.out.println("Угадайте загаданное слово?");
        String userAnswer = sc.next();
        if (userAnswer.equalsIgnoreCase(word)){
            System.out.println("Вы угадали!!!");
        } else {
            System.out.println("Вы не угадали!!! Совпадают следующие буквы: ");
            for (int i = 0; i < userAnswer.length()+5; i++) {
                char one = word.charAt(i);
                char two = userAnswer.charAt(i);
                if (one == two) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print("#");
                }
            }
        }
    }

    public static String riddleWord(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        return words[(int)(Math.random() * words.length)];
    }
}

package ru.geekbrains.homework2;

//Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
//При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
//После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static final int QUANTITY_OF_ATTEMPT = 3;
    public static final int RIGHT_LIMIT_OF_NUMBERS = 9;
    public static final int LEFT_LIMIT_OF_NUMBERS = 0;

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {

        game();
        System.out.println("Игра окончена!");
        sc.close();
    }

    public static void game() {

        int number = rand.nextInt(RIGHT_LIMIT_OF_NUMBERS);
        System.out.println("Угадайте число от " + LEFT_LIMIT_OF_NUMBERS + " до " + RIGHT_LIMIT_OF_NUMBERS);
        for (int i = 0; true; i++) {
            if (i == QUANTITY_OF_ATTEMPT) {
                System.out.println("Все попытки использованы! Правильный ответ: " + number);
                break;
            }
            System.out.print("Осталось попыток - " + (QUANTITY_OF_ATTEMPT - i) + ". Введите Ваше число: ");
            int userNumber = sc.nextInt();

            while (userNumber > RIGHT_LIMIT_OF_NUMBERS || userNumber < LEFT_LIMIT_OF_NUMBERS) {
                System.err.print("Вы ввели число недопустимого диапазона! Введите число от " + LEFT_LIMIT_OF_NUMBERS + " до " + RIGHT_LIMIT_OF_NUMBERS + " : ");
                userNumber = sc.nextInt();
            }
            if (userNumber == number) {
                System.out.println("Вы угадали! Правильный ответ: " + number);
                break;
            } else if (userNumber < number) {
                System.out.println("Вы не угадали, Ваше число меньше!");
            } else {
                System.out.println("Вы не угадали, Ваше число больше!");
            }
        }
        int stopOrContinue;
        do {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            stopOrContinue = sc.nextInt();
            if (stopOrContinue == 1) {
                game();
            } else if (stopOrContinue == 0) {
                return;
            } else {
                System.err.println("Вы ввели не 1 и не 0!");
            }
        } while (stopOrContinue > 1 || stopOrContinue < 0);
    }
}

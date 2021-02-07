package ru.geekbrains.homework4;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static char[][] map;
    public static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);
    public static final int SIZE = 5;
    public static final int NUMBER_OF_SINGS_TO_WIN = 4;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isAndGame(DOT_X, "Игрок победил")) {
                break;
            }

            aiTurn();
            printMap();
            if (isAndGame(DOT_O, "Компьютер победил")) {
                break;
            }
        }
        System.out.println("Игра окончена!");
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            if (i == 0) {
                System.out.print("\t");
            } else {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;
        } while (isValidCell(x, y));
        map[x][y] = DOT_X;
    }


    private static void aiTurn() {
        int x, y;
        do {
            y = rand.nextInt(map.length);
            x = rand.nextInt(map.length);
        } while (isValidCell(x, y));
        System.out.println("Компьютер заняд ячейку " + (y + 1) + " " + (x + 1));
        map[x][y] = DOT_O;
    }

    private static boolean isValidCell(int x, int y) {
        if (x < 0 || x >= map.length || y < 0 || y >= map.length) {
            return true;
        }
        return map[x][y] != DOT_EMPTY;
    }

    private static boolean isAndGame(char dontValue, String mess) {
        if (checkWin(dontValue)) {
            System.out.println(mess);
            return true;
        } else if (isMapFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (int j = 0; j < map.length; j++) {
                if (chars[j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {
        for (int shiftDown = 0; shiftDown < 2; shiftDown++) {
            for (int shiftToTheRight = 0; shiftToTheRight < 2; shiftToTheRight++) {
                if (checkingDiag(symbol, shiftDown, shiftToTheRight) || checkingHorizonAndVert(symbol, shiftDown, shiftToTheRight))
                    return true;
            }
        }
        return false;
    }

    private static boolean checkingDiag(char crossOrZero, int shiftDown, int shiftToTheRight) {
        boolean leftToRight;
        boolean rightToLeft;
        for (int i = shiftDown; i < NUMBER_OF_SINGS_TO_WIN + shiftDown; i++) {
            leftToRight = true;
            rightToLeft = true;
            for (int j = shiftToTheRight; j < NUMBER_OF_SINGS_TO_WIN + shiftToTheRight; j++) {
                leftToRight = leftToRight & (map[j - shiftToTheRight + shiftDown][j] == crossOrZero);
                rightToLeft = rightToLeft & (map[j - shiftToTheRight + shiftDown][(4 + shiftToTheRight) - j - (1 - shiftToTheRight)] == crossOrZero);
            }
            if (leftToRight || rightToLeft) return true;
        }
        return false;
    }

    private static boolean checkingHorizonAndVert(char crossOrZero, int shiftDown, int shiftToTheRight) {
        boolean horizon;
        boolean vert;
        for (int i = shiftDown; i < NUMBER_OF_SINGS_TO_WIN + shiftDown; i++) {
            horizon = true;
            vert = true;
            for (int j = shiftToTheRight; j < NUMBER_OF_SINGS_TO_WIN + shiftToTheRight; j++) {
                horizon = horizon & (map[i][j] == crossOrZero);
                vert = vert & (map[j][i] == crossOrZero);
            }
            if (horizon || vert) return true;
        }
        return false;
    }
}

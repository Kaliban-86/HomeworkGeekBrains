package ru.geekbrains.homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    public static char[][] map;
    public static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);
    public static final int SIZE = 3;
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

    private static boolean isAndGame(char dontValue, String mess) {
        if (checWin(DOT_X)) {
            System.out.println(mess);
            return true;
        } else if (isMapFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;

    }

    private static boolean checWin(char symb) {
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;

    }

    private static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if(map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        } return true;
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
        } while (!isValidCell(x, y));
        map[x][y] = DOT_X;
    }


    private static void aiTurn() {
        int x, y;
        do {
            y = rand.nextInt(map.length);
            x = rand.nextInt(map.length);
        } while (!isValidCell(x, y));
        System.out.println("Компьютер заняд ячейку " + (y+1) + " " + (x+1));
        map[x][y] = DOT_O;
    }

    private static boolean isValidCell(int x, int y) {
        if (x < 0 || x >= map.length || y < 0 || y >= map.length) {
            return false;
        }
        return map[x][y] == DOT_EMPTY;

    }
}

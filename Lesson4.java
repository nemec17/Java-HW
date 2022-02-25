package com.gb;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args){
        String[][] map = intField(3);
        boolean isGameActive = true;
        System.out.println("Тгра началась, удачи");

        printMap(map);
        while (isGameActive) {

            playerTurn(map);
            printMap(map);
            if (isWinner("X", map) || isDraw(map)) {
                isGameActive = false;
                break;
            }
            computerTurn(map);
            printMap(map);
            if (isWinner("0", map) || isDraw(map)) {
                isGameActive = false;
                break;
            }
        }

    }

    public static boolean isWinner(String mark, String[][] map) {
        if (
                (map[0][0].equals(mark) && map[0][1].equals(mark) && map[0][2].equals(mark))
                || (map[1][0].equals(mark) && map[1][1].equals(mark) && map[1][2].equals(mark))
                || (map[2][0].equals(mark) && map[2][1].equals(mark) && map[2][2].equals(mark))
        ) {
            System.out.println(mark + " Победил");
            return true;
        } else if (
                (map[0][0].equals(mark) && map[1][0].equals(mark) && map[2][0].equals(mark))
                || (map[0][1].equals(mark) && map[1][1].equals(mark) && map[2][1].equals(mark))
                || (map[0][2].equals(mark) && map[1][2].equals(mark) && map[2][2].equals(mark))
        ) {
            System.out.println(mark + " Победил");
            return true;
        } else if (
                (map[0][0].equals(mark) && map[1][1].equals(mark) && map[2][2].equals(mark))
                || (map[2][0].equals(mark) && map[1][1].equals(mark) && map[0][2].equals(mark))
        ) {
            System.out.println(mark + " Победил");
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDraw(String[][] map) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {

                if (map[i][j].equals("*")) {
                    return false;
                }
            }
        }

        System.out.println("Ничья");
        return true;
    }

    public static void computerTurn(String[][] map) {

        Random random = new Random();

        boolean isActiveTurn = true;

        while (isActiveTurn) {

            System.out.println("Компьютер ходит, подождите");

            int x = random.nextInt(map[0].length);
            int y = random.nextInt(map.length);

            if (map[x][y].equals("*")) {
                map[x][y] = "0";
                isActiveTurn = false;
            }
        }
        System.out.println("Компьютер содил");
    }

    public static void playerTurn(String[][] map) {

        Scanner sc = new Scanner(System.in);

        boolean isActiveTurn = true;

        while (isActiveTurn) {

            System.out.println("Игрок ходит, на какие клетки вы ходите");

            int x = sc.nextInt();
            int y = sc.nextInt();

            if ((x > 0 && x <= map[0].length) && (y > 0 && y <= map.length)) {
                if (map[x - 1][y - 1].equals("*")) {
                    map[x-1][y-1] = "X";
                    isActiveTurn = false;
                } else {
                    System.out.println("Данный ход невозможен!");
                }
            } else {
                System.out.println("Вы вышли за пределы поля!");
            }
        }
    }

    public static void printMap(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] intField(int size) {

        String[][] map = new String[size][size];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = "*";
            }
        }
        return map;
    }
}
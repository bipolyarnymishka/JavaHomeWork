import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Random;
import java.util.Scanner;

public class lesson_4 {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            player();
            printMap();
            if (isWinner(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }

            if (isWinnerTwo(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }

            if (mapFull()) {
                System.out.println("Ничья!");
                break;
            }

            computer();
            printMap();
            if (isWinner(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }

            if (isWinnerTwo(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }

            if (mapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void player() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите координаты в формате X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!check(x,y));
        map[y][x] = DOT_X;
    }

    public static void computer() {
        int x;
        int y;
        Random random = new Random();
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!check(x, y));

        System.out.println("Компьютер сходил в " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean check(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static boolean isWinner(char symb) {
        for (int i = 0; i < SIZE; i++) {

            int horizontal = 0;
            int vertical = 0;

            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb)
                {
                    horizontal ++;
                }
                else
                {
                    horizontal = 0;
                }

                if (map[j][i] == symb)
                {
                    vertical ++;
                }
                else
                {
                    vertical = 0;
                }
            }
            if ((horizontal == SIZE) || (vertical == SIZE))
            {
                return true;
            }

        }
        return false;
    }

    public static boolean isWinnerTwo(char symb) {
        int oneDiagonal = 0;
        int twoDiagonal = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symb)
            {
                oneDiagonal ++;
            }
            else
            {
                oneDiagonal = 0;
            }

            if (map[i][map.length - 1 - i] == symb)
            {
                twoDiagonal ++;
            }
            else
            {
                twoDiagonal = 0;
            }
            if ((oneDiagonal == SIZE) || (twoDiagonal == SIZE))
            {
                return true;
            }

        }
        return false;
    }


    public static boolean mapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}

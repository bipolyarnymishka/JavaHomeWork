public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orangre");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 1;
        int b = 3;

        int summa = a + b;

        if (summa >= 0)
        {
            System.out.println("Сумма положительная");
        }

        if (summa < 0)
        {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 13;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (0 < value && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = -7;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
    }



}
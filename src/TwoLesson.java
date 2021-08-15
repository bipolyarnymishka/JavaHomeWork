public class TwoLesson {
    public static void main (String[] args)
    {
        boolean flag = sumNumbers(3, 10);
        System.out.println(flag);

        positiveOrNegative(-7);

        boolean flag2 = posotiveOrNegativTwo(11);
        System.out.println(flag2);

        printWord("Heloo", 5);
    }

    public static boolean sumNumbers(int a, int b)
    {
        return 10 <= a + b && a + b <= 20;
    }

    public static void positiveOrNegative (int c)
    {
        if (c >= 0)
        {
            System.out.println("Положительное число");
        }
        else
        {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean posotiveOrNegativTwo (int d) {
       return d < 0;
    }

    public static void printWord (String message, int times)
    {
        for (int i = 0; i < times; i++)
        {
            System.out.println(message);
        }
    }


}

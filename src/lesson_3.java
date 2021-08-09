import java.util.Arrays;

public class lesson_3 {
    public static void main(String[] args) {

        // Задание 1
    int[] arr = { 1, 0, 0, 1, 1, 0 };
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                arr[i] = 1;
            }
            else
            {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        // Задание 2
        int[] arr2 = new int[100];
            for (int i = 0; i < arr2.length; i++)
            {
                arr2[i] = i + 1;
            }
        System.out.println(Arrays.toString(arr2));

        // Задание 3
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            for (int i = 0; i < arr3.length; i++)
            {
                if (arr3[i] > 6)
                {
                    arr3[i] = arr3[i] * 2;
                }
            }
            System.out.println(Arrays.toString(arr3));

            // Задание 4
        int[][] square = new int[4][4];
            for (int i = 0; i < square.length; i++)
            {
                for (int j = 0; j < square.length; j++)
                {
                    if (square[i] == square[j])
                    {
                        square[i][j] = 1;
                    }
                    System.out.print(square[i][j] + " ");

                }
                System.out.println();
            }

            System.out.println(Arrays.toString(twoArguments(5,10))); // к 5 Заданию
    }

             //задание 5
        public static int[] twoArguments(int len, int initialValue)
        {
            int[] arr5 = new int [len];
                for (int i = 0; i < arr5.length; i++)
                {
                    arr5[i] = initialValue;
                }
            return arr5;
        }
}

import static java.lang.System.*;

public class Arrays {
    public static void main (String[] args) {
        int number = 10; // примитивный тип данных     [10]
        int[] numbers = new int[5];// numbers -> [массив] Ссылочный тип данных
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}

class Arrays_of_Strings {
    public static void main (String[] args) {
        int[] numbers = new int[5];
        numbers [0] = 10;
        String[] strings = new String[3];
        strings [0] = "Привет";
        strings [1] = "Пока";
        strings [2] = "Java";
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String string : strings) { // forech
            System.out.println(string);
        }
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum += x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s = null;
        System.out.println(s);
    }
}

class Multidimensional_arrays {
    public static void main (String[] args) {
        int[] number = {1, 2, 3}; // одномерный массив

        int[][] matrices = {{1, 2, 3}, // двумерный массив
                {4, 5, 6},
                {7, 8, 9}};

        for (int[] ints : matrices) {
            for (int anInt : ints) {
                out.print(anInt + " ");
            }
            out.println();
        }
    }
}
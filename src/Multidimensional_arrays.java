import java.util.Arrays;

import static java.lang.System.*;

public class Multidimensional_arrays {
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
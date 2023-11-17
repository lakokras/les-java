import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgorithms {
    public static void main(String[] args) {
//        int[] digits = {3, 1, 7, 9, 9, 5};
//        System.out.println(maxNumberFromDigits(digits));

        int[] stations = {0, 200, 375, 550, 750, 950};
        System.out.println((minStops(stations, 400)));
    }

//    public static String maxNumberFromDigits(int[] digits) {
//        // O(n*log(n))
//        Arrays.sort(digits);
//
//        String result = "";
//
//        for (int i = digits.length - 1; i >= 0; i--)
//            result += digits[i];
//
//        return result;

        // ничего не понятно, но очень интересно
//        return String.join("", Arrays.stream((digits)).boxed()
//                .sorted(Collections.reverseOrder())
//                .map(String::valueOf)
//                .toArray(String[]::new));
//    }

    public static int minStops(int[] stations, int capacity) {
        int result = 0; // минимальное количество остановок
        int currentStop = 0;

        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;

            while (nextStop < stations.length - 1 &&
                    stations[nextStop + 1] - stations[currentStop] <= capacity)
                nextStop++;

            if (currentStop == nextStop)
                return -1; // returns -1, если нет возможности добраться из точки A в точку B

            if (nextStop < stations.length - 1)
                result++;

            currentStop = nextStop;
        }

        return result;
    }
}
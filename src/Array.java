import java.util.*;

public class Array {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // arrayList.remove(5); not effective suka python
        System.out.println(list);
    }
}

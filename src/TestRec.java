public class TestRec {
    public static void main(String[] args) {
        System.out.println(fac(4));
    }

    private static int fac(int n) {
        if (n == 1)
            return 1;

        return n * fac(n - 1);
    }


    /*
 counter(3) –> counter(2) –> counter(1)
    private static void counter(int n) {
        if (n == 0)
            return;

        System.out.println(n);

        counter(n - 1); // 3, 2, 1
    }
*/

}
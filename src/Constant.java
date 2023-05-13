public class Constant {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);
        System.out.println(Test.CONSTANT);
    }
}

class Test {
    public static final int CONSTANT = 0;
}
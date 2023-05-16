public class Constant {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);
        System.out.println(TestConstant.CONSTANT);
    }
}

class TestConstant {
    public static final int CONSTANT = 0;
}
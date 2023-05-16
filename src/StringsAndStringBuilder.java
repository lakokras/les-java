public class StringsAndStringBuilder {
    public static void main(String[] args) {
        int x = 5;
        String s = "Hello";
        String space = " ";
        String name = "Bob";
        System.out.println(s + space + name);
        System.out.println("Hello" + " " + "John");
        System.out.println("My number is " + x);
    }
}

/* если происходит много конкретинации,
    то использовать лучше StringBuilder
 */

class StringBuilder {
    public static void main(String[] args) {
        System.out.printf("This is a string, %s \n", "NICE");
        System.out.printf("String %.2f \n", 45.32265);
        System.out.printf("String %10d \n", 532);
    }
}

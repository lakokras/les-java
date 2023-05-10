import java.util.Scanner;

public class Switch {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи вес одной конфеты: ");
        int yammy = scanner.nextInt();

        switch (yammy) {
            case 36 -> {
                int i = 2000 / 36;
                System.out.println(i + " штук");
            }
            case 40 -> {
                int j = 2000 / 40;
                System.out.println(j + " штук");
            }
            default -> System.out.println("Решил не верный вес написать, хитрец");
        }
    }
}

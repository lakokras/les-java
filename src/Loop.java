import java.util.Scanner;

public class Loop {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введи 5");
            value = scanner.nextInt();
        } while(value != 5);

        System.out.println("Вы ввели 5");
    }
}

class ForLoop {
    public static void main(String[] args) {
        for ( int i = 10; i >= 0; i--) {
            System.out.println("Hello " + i);
        }
    }
}

class If {
    public static void main(String[] args) {
        int myInt = 15;
        if(myInt < 10) {
            System.out.println("Да, верно!");
        } else if(myInt > 20) {
            System.out.println("Нет, не верно!");
        } else {
            System.out.println("Ни один из вариантов");
        }
    }
}

class WhileLoop {
    public static void main(String[] args) {
        int value = 0;
        while(value < 5) {
            System.out.println("Hello " + value);
            value += 1;
        }
    }
}

class Switch {
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

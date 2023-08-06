import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.text.ParseException;

public class Exceptions {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("Test");
        Scanner scanner = new Scanner(file);
    }
}

// Checked Exception (Compile time exception) = исключительные случаи в работе программы
// Unchecked (Runtime exception) = ошибка в работе программы

class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if(x != 0) {
                throw new ScannerException("Пользователь ввел что-то кроме нуля");
            }
        }
    }
}


class Exceptions3 {
    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {

        }
    }

    public static void run() throws IOException,
            ParseException,
            IllegalArgumentException {

    }
}
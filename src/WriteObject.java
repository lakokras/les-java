import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person(1, "Bob");

        try (ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream("people.bin"))) {

            oos.writeObject(person1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

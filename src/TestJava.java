import java.util.ArrayList;
import java.util.List;

public class TestJava {
    public static void main(String[] args) {

        // Java 5 //
        List animals = new ArrayList();
        AnimalGeneric ourAnimal = new AnimalGeneric();
        animals.add("cat");
        animals.add("dog"); // 1
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(1); // Downcasting
        System.out.println(animal);

        // С появлением дженериков (generic) //
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
//        animals2.add(ourAnimal); не трогать!

        String animal2 = animals2.get(2);
        System.out.println(animal2);

        // Java 7 //
        List<String> animals3 = new ArrayList<>();
        animals3.add("cat");
        animals3.add("dog");
        animals3.add("frog");

        String animal3 = animals3.get(0);
        System.out.println(animal3);
    }
}

class AnimalGeneric {
}
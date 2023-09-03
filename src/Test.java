public class Test {
    public static void main(String[] args) {

        AnimalT animal1 = new AnimalT(1);
        AnimalT animal2 = new AnimalT(2);

        System.out.println(animal1.equals(animal2));
    }
}

class AnimalT {
    private int id;

    public AnimalT(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        AnimalT otherAnimal = (AnimalT) obj;

        return this.id == otherAnimal.id;
    }
}

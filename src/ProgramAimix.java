public class ProgramAimix {
    public static void main(String[] args) {
        People p = new People();
        p.name = "Tom";
        p.age = 23;
        ChangePeople(p);

        System.out.println(p.name);
        System.out.println(p.age);
    }

    static void ChangePeople(People person) {
        person.name = "Alice";
        person = new People();
        person.name = "Bill";
        person.age = 45;
        System.out.println(person.name);
    }

    static void ChangePeople1(People person) {
        person.name = "Alice";
        person = new People();
        person.name = "Bill";
        person.age = 45;
    }

}
class People {
    public String name;
    public int age;
}
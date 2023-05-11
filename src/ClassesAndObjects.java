public class ClassesAndObjects{
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setName("Какое-то имя");
        person1.setAge(-12);
        System.out.println
                ("Выводим значения в main методе: " + person1.getName());
        System.out.println
                ("Выводим значения в main методе: " + person1.getAge());
    }
}

// У класса могут быть:
// 1. Данные (поля)
// 2. Действия, которые он может совершать (методы)

class Person{
    private String name;
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Ты ввел пустое имя.");
        } else {
            name = userName;
        }
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if (userAge < 0){
            System.out.println
                    ("Возраст должен быть положительным.");
        } else {
            age = userAge;
        }
    }
    public int getAge(){
        return age;
    }

    int calculateYearsToRetirement() {
        return 65 - age;
    }

    void speak(){
        for(int i = 0; i < 3; i++)
            System.out.println
                    ("Меня зовут " + name + ", мне " + age + " лет.");
    }
    void sayHello() {
        System.out.println("Привет!");
    }
}
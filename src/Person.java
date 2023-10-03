import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = -2262924119696547359L;

    private int id;
    private String personName;

    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }
    public String getPersonName() {
        return personName;
    }

    public String toString() {
        return id + " : " + personName;
    }
}
package contestant;

public class Contestant {

    private int id;
    private String name;
    private String surname;
    private int age;

    public Contestant(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("---------------------------");
    }

    public int getId() {
        return id;
    }
}
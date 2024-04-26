public class Studente {
    public Studente(String name, int age){
        this.name = name;
        this.age = age;

    }
    public String name;

    public int age;

    @Override
    public String toString() {
        return "Studente: " +
                "name = " + name +
                ", age = " + age;
    }
}

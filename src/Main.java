import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Aldo", 34);
        Studente studente2 = new Studente("Giovanni", 20);
        Studente studente3 = new Studente("Giacomo", 25);
        Studente studente4 = new Studente("Pio", 24);
        Studente studente5 = new Studente("Amedeo", 30);
        Studente studente6 = new Studente("Giuseppe", 29);
        Studente studente7 = new Studente("Laura", 32);
        Studente studente8 = new Studente("Giusy", 27);
        Studente studente9 = new Studente("Claudia", 28);
        Studente studente10 = new Studente("Alfonso", 28);
        Studente studente11 = new Studente("Barbara", 34);
        Studente studente12 = new Studente("Filippo", 30);

        List<Studente> lista = new ArrayList<>();
        lista.add(studente1);
        lista.add(studente2);
        lista.add(studente3);
        lista.add(studente4);
        lista.add(studente5);
        lista.add(studente6);
        lista.add(studente7);
        lista.add(studente8);
        lista.add(studente9);
        lista.add(studente10);
        lista.add(studente11);
        lista.add(studente12);

        Collections.sort(lista, new Comparator<Studente>() {
            @Override
            public int compare(Studente o1, Studente o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        for (Studente students : lista){
            System.out.println("lISTA: " + students);
        }
    }
}
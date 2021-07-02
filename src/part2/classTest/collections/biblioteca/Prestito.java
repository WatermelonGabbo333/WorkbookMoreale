package part2.classTest.collections.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Prestito {

    private List<Libro> prestito = new ArrayList<>();

    public Prestito() {
    }

    public List<Libro> getPrestito() {
        return prestito;
    }

    public void setPrestito(List<Libro> prestito) {
        this.prestito = prestito;
    }

}

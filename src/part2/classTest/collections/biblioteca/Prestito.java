package part2.classTest.collections.biblioteca;

import java.util.List;

public class Prestito {

    private Utente utente;
    private List<Libro> prestito;

    public Prestito(Utente utente, List<Libro> prestito) {
        this.utente = utente;

        this.prestito = prestito;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public List<Libro> getPrestito() {
        return prestito;
    }

    public void setPrestito(List<Libro> prestito) {
        this.prestito = prestito;
    }
}

package part2.classTest.collections.biblioteca;

public class Utente {

    private String nome;
    private String cognome;
    private int id=0;
    private Prestito prestito;

    public Utente(String nome, String cognome, int id) {
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
    }

    public Prestito getPrestito() {
        return prestito;
    }

    public void setPrestito(Prestito prestito) {
        this.prestito = prestito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package part2.classTest.collections.biblioteca;

public class Categoria {

    private String titolo;
    private String descrizione;

    public Categoria(String titolo, String descrizione) {
        this.titolo = titolo;
        this.descrizione = descrizione;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}

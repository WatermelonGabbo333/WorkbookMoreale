package part2.classTest.collections.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    private String autore;
    private int dataPubblicazione=0;
    private int numPagine=0;
    private int numVolumi=0;
    private int numCapitoli=0;
    private List<Categoria> genere = new ArrayList<>();



    public Libro(String autore, int dataPubblicazione, int numPagine, int numVolumi, int numCapitoli) {
        this.autore = autore;
        this.dataPubblicazione = dataPubblicazione;
        this.numPagine = numPagine;
        this.numVolumi = numVolumi;
        this.numCapitoli = numCapitoli;
    }

    public List<Categoria> getGenere() {
        return genere;

    }

    public void setGenere(List<Categoria> genere) {
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(int dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }

    public int getNumVolumi() {
        return numVolumi;
    }

    public void setNumVolumi(int numVolumi) {
        this.numVolumi = numVolumi;
    }

    public int getNumCapitoli() {
        return numCapitoli;
    }

    public void setNumCapitoli(int numCapitoli) {
        this.numCapitoli = numCapitoli;
    }
}

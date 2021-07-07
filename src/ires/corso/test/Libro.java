package ires.corso.test;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Libro implements Serializable {

    private long _ID;
    private String titolo;
    private String autore;
    private String sinossi;
    private String codiceIsbn;
    private LocalDate dataPubblicazione;
    private Genere genere;
    public enum Genere {fantasy, giallo, fantascienza, romantico}
    private Giudizio giudizio;
    public enum Giudizio {neutro, accettabile, carino, da_rileggere, fantastico}
    private int avanzamentoLettura =0;

    protected Libro() {
    }

    protected Libro(Long id) {
    }

    public long getID() {
        return _ID;
    }

    public void setID(long _ID) {
        this._ID = _ID;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getSinossi() {
        return sinossi;
    }

    public void setSinossi(String sinossi) {
        this.sinossi = sinossi;
    }

    public String getCodiceIsbn() {
        return codiceIsbn;
    }

    public void setCodiceIsbn(String codiceIsbn) {
        this.codiceIsbn = codiceIsbn;
    }

    public LocalDate getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(LocalDate dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public Giudizio getGiudizio() {
        return giudizio;
    }

    public void setGiudizio(Giudizio giudizio) {
        this.giudizio = giudizio;
    }

    public int getAvanzamentoLettura() {
        return avanzamentoLettura;
    }

    public void setAvanzamentoLettura(int avanzamentoLettura) {
        this.avanzamentoLettura = avanzamentoLettura;
    }

    public String prettyPrint(){
        String riga = String.format("ID : %d \n Titolo : %s \n Autore : %s \n Sinossi : %s \n Codice ISBN : %s \n Data di pubblicazione : %s \n Genere : %s \n Giudizio personale : %s \n Avanzamento nella lettura : %d",
                getID(),getTitolo(),getAutore(),getSinossi(),getCodiceIsbn(),getDataPubblicazione().toString(),getGenere().toString(),getGiudizio().toString(),getAvanzamentoLettura());
        return riga;

    }

    public Libro cloneForUpdate(Long id){
        Libro copia = new Libro(id);
        copia._ID = id;
        copia.autore = this.autore;
        copia.sinossi = this.sinossi;
        copia.codiceIsbn = this.codiceIsbn;
        copia.dataPubblicazione = this.dataPubblicazione;
        copia.genere = this.genere;
        copia.giudizio = this.giudizio;
        copia.avanzamentoLettura = this.avanzamentoLettura;
        return copia;
    }


}

package part2.classTest.toDo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class ToDo implements Serializable
{

    // Contatore static, di classe
    private static long idSeed;

    // Properties dell'istanza
    protected long _ID;
    private String titolo;
    private String descrizione;
    private LocalDate dataInserimento;
    private LocalDate dataConsegna;
    private Priorità priorità;
    public enum Priorità {
        alta,media,bassa
    }
    private Stato stato;
    public enum Stato {
        da_fare, in_esecuzione , completata , annullata
    }

    protected long getNewId() {
        return ++idSeed;
    }

    protected ToDo() {
        this._ID = getNewId();
        this.dataInserimento = LocalDate.now();
    }

    protected ToDo(Long id){
        this.dataInserimento = LocalDate.now();

    }


    // classe principale

    // ...costruttore con ID incrementale...


    public static long getIdSeed() {
        return idSeed;
    }

    public static void setIdSeed(long idSeed) {
        ToDo.idSeed = idSeed;
    }

    public long get_ID() {
        return this._ID;
    }

    public void set_ID(long _ID) {
        this._ID = _ID;
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

    public LocalDate getDataInserimento() {
        return dataInserimento;
    }

    public LocalDate getDataConsegna() {
        return dataConsegna;
    }

    public void setDataConsegna(LocalDate dataConsegna) {
        this.dataConsegna = dataConsegna;
    }

    public Priorità getPriorità() {
        return priorità;
    }

    public void setPriorità(Priorità priorità) {
        this.priorità = priorità;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public void setDataInserimento(LocalDate dataInserimento) {
        this.dataInserimento = dataInserimento;
    }

    public ToDo cloneForUpdate(Long id) {
        // fabbrica una copia esatta del To-Do (compreso l'ID)
        ToDo copia = new ToDo(id);
        copia._ID = id;
        copia.titolo = this.titolo;
        copia.descrizione = this.descrizione;
        copia.dataConsegna = this.dataConsegna;
        copia.priorità = this.priorità;
        copia.stato = this.stato;

        return copia;
    }

}

package part2.classTest.collections;

import java.util.HashMap;
import java.util.Map;

public class Course {
    private String titolo;
    private String descrizione;
    private String settore;
    private Map<Assignment,Map<Student,Double>> valutazioni;

    public Course(String titolo, String descrizione, String settore) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.settore = settore;
    }

    public Map<Assignment, Map<Student, Double>> getValutazioni() {
        return valutazioni;
    }

    public void setValutazioni(Map<Assignment, Map<Student, Double>> valutazioni) {
        this.valutazioni = valutazioni ;
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

    public String getSettore() {
        return settore;
    }

    public void setSettore(String settore) {
        this.settore = settore;
    }
}

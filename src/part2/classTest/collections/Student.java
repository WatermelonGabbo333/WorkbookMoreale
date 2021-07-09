package part2.classTest.collections;

import java.util.ArrayList;

public class Student {

    private String nome;
    private String cognome;
    private String codiceStudente;

    public Student(String nome, String cognome, String codiceStudente) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceStudente = codiceStudente;
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

    public String getCodiceStudente() {
        return codiceStudente;
    }

    public void setCodiceStudente(String codiceStudente) {
        this.codiceStudente = codiceStudente;
    }
}
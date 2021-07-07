package ires.corso.test;

import java.util.Collections;
import java.util.List;

public class LibroList {

    public static void viewByTitolo(){
        List<Libro> lLibro = Biblioteca.getBibliotecaRepository().getLibroList();
        Collections.sort(lLibro,(Libro l1, Libro l2) -> l1.getTitolo().compareTo(l2.getTitolo()));
        stampa(lLibro);
    }

    public static void stampa(List<Libro> lLibro){

        for (Libro l : lLibro){
            System.out.println(l.prettyPrint());
        }


    }
}

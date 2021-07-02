package part2.classTest.collections.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public static void main(String[] args) {

        Utente u1 = new Utente("Pinko","Pallino",1);
        List<Utente> utenti = new ArrayList<Utente>();
        utenti.add(u1);
        Categoria c1 = new Categoria("Fantasy","ci sono le magie");
        Libro l1 = new Libro("Tolkien",1900,300,3,3);
        Libro l2 = new Libro("Rowling",2000,100,10,10);
        l1.getGenere().add(c1);
        l2.getGenere().add(c1);
        Prestito p1 = new Prestito();
        p1.getPrestito().add(l1);
        p1.getPrestito().add(l2);
        u1.setPrestito(p1);
//mi torna una lista vuota provo ad aggiungere subito un elemento
//  p1.List<Libri>.size()
        //.
        //un contatore per categoria
        //c1
        //"categoria"
        //u1.p1.l1.c1
        //4 foreach
        //ciclo sugli utenti
        //u1.p1
        //ciclo sui libri
        //ciclo sulle categorie
        //if
        //{ contatore ++ esterno associato ad una categoria}
        int fantasy =0;
        for (Utente ut : utenti){
            Prestito pre= ut.getPrestito();
            for (Libro lib: pre.getPrestito()){
                for (Categoria cat: lib.getGenere()){
                       if (cat.getTitolo().equals("Fantasy"))
                           fantasy++;

                }
            }
        }
        System.out.println(fantasy);

        //va fatto per ogni categoria
        //3 cicli e un contatore apposta


    }

}

package ires.corso.test2.test;

import java.time.LocalDate;
import java.util.Scanner;

public class LibroManager {

    public static void createNewLibro() {
        Libro l = new Libro();
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci titolo : ");
        l.setTitolo(in.nextLine());
        System.out.println("Inserisci autore : ");
        l.setAutore(in.nextLine());
        System.out.println("Inserisci sinossi : ");
        l.setSinossi(in.nextLine());
        System.out.println("Inserisci codice ISBN : ");
        l.setCodiceIsbn(in.nextLine());
        try {
            System.out.println("Inserisci data di pubblicazione (yyyy-mm-gg) : ");
            l.setDataPubblicazione(LocalDate.parse(in.nextLine()));
        }catch (Exception e){
            System.out.println("Non hai inserito correttamente la data ritorno al menu precedente");
            return;
        }
        try {
            System.out.println("Inserisci il genere tra : (fantasy, giallo, fantascienza, romantico)");
            l.setGenere(Libro.Genere.valueOf(in.nextLine()));
        }catch (Exception e){
            System.out.println("Non hai inserito correttamente il genere ritorno al menu precedente");
            return;
        }

        Biblioteca._repository.add(l);

    }

    public static void updateLibro() {
        boolean uscita = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci l'id del libro che vuoi modificare ");
        Long id = in.nextLong();
        if (Biblioteca._repository._data.containsKey(id)) {
            Libro libro = Biblioteca.getLibro(id);
            Long idPerClone = libro.getID();
            Libro copia = libro.cloneForUpdate(idPerClone);
            while (!uscita) {
                System.out.println("Cosa vuoi modificare ?");
                System.out.println("Scegli tra : ");
                System.out.println("titolo,autore,sinossi,codice isbn,data pubblicazione,genere : ");
                System.out.println("Per uscire premi q");
                in = new Scanner(System.in);
                String campo = in.nextLine();
                switch (campo) {
                    case "titolo":
                        copia.setTitolo(campo);
                        break;
                    case "autore":
                        copia.setAutore(campo);
                        break;
                    case "sinossi":
                        copia.setSinossi(campo);
                        break;
                    case "codice isbn":
                        copia.setCodiceIsbn(campo);
                        break;
                    case "data pubblicazione":
                        try{
                            copia.setDataPubblicazione(LocalDate.parse(campo));}
                        catch (Exception e){
                            System.out.println("Non hai inserito correttamente la data ritorno al menu precedente");
                            return;
                        }
                        break;
                    case "genere":
                        try {
                            copia.setGenere(Libro.Genere.valueOf(campo));
                        }catch (Exception e){
                            System.out.println("Non hai inserito correttamente il genere ritorno al menu precedente");
                            return;
                        }
                        break;

                    case "q":
                        uscita = true;
                        break;
                    default:
                        System.out.println("Input non valido");
                        break;
                }
            }
            Biblioteca._repository.update(copia);
        } else {
            System.out.println("L'id inserito non è presente");
        }
    }

    public static void removeLibro(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci l'id del libro che vuoi rimuovere ");
        Long id = in.nextLong();
        if (Biblioteca._repository._data.containsKey(id))
            Biblioteca.delete(id);
        else
            System.out.println("L'id inserito non è presente");
    }

    public static void avanzamentoLettura(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci l'id del libro che vuoi leggere ");
        Long id = in.nextLong();
        if (Biblioteca._repository._data.containsKey(id)){
            Scanner valuta = new Scanner(System.in);
            System.out.println("Inserisci un numero da 1 a 100 per le pagine che vuoi leggere ");
            int pagine = valuta.nextInt();
            Libro libro = Biblioteca.getLibro(id);
            Long idPerClone = libro.getID();
            Libro copia = libro.cloneForUpdate(idPerClone);
            if (copia.getAvanzamentoLettura()>=100)
                System.out.println("Libro già letto");
            else {
                int tot = pagine + copia.getAvanzamentoLettura();
                copia.setAvanzamentoLettura(tot);
                Biblioteca._repository.update(copia);
            }
        }
        else
            System.out.println("L'id inserito non è presente");
    }

    public static void giudizio(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci l'id del libro che vuoi valutare ");
        Long id = in.nextLong();
        if (Biblioteca._repository._data.containsKey(id)){
            Libro libro = Biblioteca.getLibro(id);
            Long idPerClone = libro.getID();
            Libro copia = libro.cloneForUpdate(idPerClone);
            if (copia.getAvanzamentoLettura()>=100){
                Scanner giudizio = new Scanner(System.in);
                System.out.println("Inserisci un giudizio tra (neutro, accettabile, carino, da_rileggere, fantastico)");
                Libro.Giudizio valutazione = Libro.Giudizio.valueOf( giudizio.nextLine());
                copia.setGiudizio(valutazione);
                Biblioteca._repository.update(copia);
            }else {
                System.out.println("Non l'hai ancora letto ");
            }
        }else
            System.out.println("L'id inserito non è presente");
    }
}
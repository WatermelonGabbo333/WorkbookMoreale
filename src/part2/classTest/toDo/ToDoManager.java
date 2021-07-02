package part2.classTest.toDo;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class ToDoManager
{
    // - metodi per creazione nuovo TO-DO
    public static void createNewToDo() {
        ToDo t = new ToDo();
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci titolo : ");
        t.setTitolo(in.nextLine());
        System.out.println("Inserisci descrizione : ");
        t.setDescrizione(in.nextLine());
        System.out.println("Inserisci data di consegna : ");
        t.setDataConsegna(LocalDate.parse(in.nextLine()));
        System.out.println("Inserisci priorità : (tra alta,media,bassa)");
        t.setPriorità(Priorità.valueOf(in.nextLine()));
        System.out.println("Inserisci stato : (tra da_fare, in_esecuzione , completata , annullata)");
        t.setStato(Stato.valueOf(in.nextLine()));
        //aggiungere t a Map
        ToDoRepository._repository.add(t);

    }
    // - gestisce input utente (cioè loop di richiesta di quali campi devono essere modificati)
    public static void updateToDo() {
        boolean uscita = false;
        // Chiede quale Id si vuole modificare
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci l'id del todo che vuoi modificare ");
        Long id = in.nextLong();
        ToDo todo= ToDoRepository._data.get(id);
        // Si chiede un "clone" del TO-DO
        ToDo copia = todo.cloneForUpdate();
        // Loop di richiesta dati da modificare
        while (!uscita){
            System.out.println("Cosa vuoi modificare ?");
            System.out.println("Scegli tra : ");
            System.out.println("titolo,descrizione,data di consegna,priorità,stato : ");
            System.out.println("Per uscire premi q");
            String campo = in.nextLine();
            switch (campo) {
                case "titolo":
                    copia.setTitolo(campo);
                    break;
                case "descrizione":
                    copia.setDescrizione(campo);
                    break;
                case "data di consegna":
                    copia.setDataConsegna(LocalDate.parse(campo));
                    break;
                case "priorità":
                    copia.setPriorità(Priorità.valueOf(campo));
                    break;
                case "stato":
                    copia.setStato(Stato.valueOf(campo));
                    break;
                case "q":
                    uscita = true;
                    break;
                default:
                    System.out.println("Input non valido");
                    break;
            }
        }
        // Salvataggio delle modifiche tramite ToDoRepository (update...)
        ToDoRepository._repository.update(copia);
    }

    public static void removeToDo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci l'id del todo che vuoi rimuovere ");
        Long id = in.nextLong();
        ToDoRepository._data.remove(id);
    }


}

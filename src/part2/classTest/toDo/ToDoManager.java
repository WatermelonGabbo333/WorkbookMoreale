package part2.classTest.toDo;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.util.zip.DataFormatException;

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
        try {
            System.out.println("Inserisci data di consegna (yyyy-mm-gg) : ");
            t.setDataConsegna(LocalDate.parse(in.nextLine()));
        }catch (Exception e){
            System.out.println("Non hai inserito correttamente la data ritorno al menu precedente");
            return;
        }
        try {
            System.out.println("Inserisci priorità : (alta,media,bassa)");
            t.setPriorità(ToDo.Priorità.valueOf(in.nextLine()));
        }catch (Exception e){
            System.out.println("Non hai inserito correttamente la priorità ritorno al menu precedente");
            return;
        }
        try {
            System.out.println("Inserisci stato : (da_fare, in_esecuzione , completata , annullata)");
            t.setStato(ToDo.Stato.valueOf(in.nextLine()));
        }catch (Exception e){
            System.out.println("Non hai inserito correttamente lo stato ritorno al menu precedente");
            return;
        }
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
        if (ToDoRepository._repository._data.containsKey(id)) {
            ToDo todo = ToDoRepository.getToDo(id);
            // Si chiede un "clone" del TO-DO
            Long idPerClone = todo.getID();
            ToDo copia = todo.cloneForUpdate(idPerClone);
            // Loop di richiesta dati da modificare
            while (!uscita) {
                Scanner input = new Scanner(System.in);
                System.out.println("Cosa vuoi modificare ?");
                System.out.println("Scegli tra : ");
                System.out.println("titolo,descrizione,data di consegna,priorità,stato : ");
                System.out.println("Per uscire premi q");
                String campo = input.nextLine();
                switch (campo) {
                    case "titolo":
                        copia.setTitolo(inputUtenteStringa(campo));
                        break;
                    case "descrizione":
                        copia.setDescrizione(inputUtenteStringa(campo));
                        break;
                    case "data di consegna":
                        try{
                        copia.setDataConsegna(LocalDate.parse(inputUtenteStringa(campo)));}catch (Exception e){
                            System.out.println("Non hai inserito correttamente la data ritorno al menu precedente");
                            return;
                        }
                        break;
                    case "priorità":
                        try {
                            copia.setPriorità(ToDo.Priorità.valueOf(inputUtenteStringa(campo)));
                        }catch (Exception e){
                            System.out.println("Non hai inserito correttamente la priorità ritorno al menu precedente");
                            return;
                        }
                        break;
                    case "stato":
                        try {
                            copia.setStato(ToDo.Stato.valueOf(inputUtenteStringa(campo)));
                        }catch (Exception e){
                            System.out.println("Non hai inserito correttamente lo stato ritorno al menu precedente");
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
            // Salvataggio delle modifiche tramite ToDoRepository (update...)
            ToDoRepository._repository.update(copia);
        } else {
            System.out.println("L'id inserito non è presente");
        }
    }

    public static String inputUtenteStringa(String campo){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci nuovo "+ campo);
        String inputs = input.nextLine();
        return inputs;
    }

    public static void removeToDo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci l'id del todo che vuoi rimuovere ");
        Long id = in.nextLong();
        if (ToDoRepository._repository._data.containsKey(id))
        ToDoRepository.delete(id);
        else
            System.out.println("L'id inserito non è presente");
    }


}

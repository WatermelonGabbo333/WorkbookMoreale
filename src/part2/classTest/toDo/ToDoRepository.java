package part2.classTest.toDo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// GRUPPO 4:
public class ToDoRepository implements Serializable
{
    /* GESTORE DELL'ARCHIVIO DEI TO-DO == DATABASE */
//HashMap Long,To-Do
    // Contiene una HashMap di tutti i TO-DO a sistema:
    // - implementa il metodo di salvataggio su file
    // - implementa il metodo di caricamento da file
    // - metodi per individuare, aggiungere, eliminare un TO-DO
    // - restituisce una copia di tutti i TO-DO come ArrayList, da
    //   usare per le visualizzazioni di ToDoList

    // Serializzabile con la funzione writeObject()
    public static ToDoRepository loadFromFile(String fileName) {
        // Individua il file e lo deserializza con readObject
        // _repository = ...
        return _repository;
    }

    protected static ToDoRepository _repository=null;

    public static ToDoRepository getToDoRepository() {
        return _repository;
    }

    protected static Map<Long, ToDo> _data = new HashMap<>();
    //cast da Map ad ArrayList


    public void delete(Long ID) {

    };

    public void add(ToDo t) {
        // si deve entrare nell'oggetto t e leggere il suo ID

        // per poi salvarlo nella mappa correttamente (con put(ID, t))
        _data.put(t.get_ID(),t);
    }

    public void update(ToDo t) {
        // si prende l'ID dall'oggetto t
        // si recupera dalla mappa il TO-DO corrispondente con get(t), per controllo
        // si sostituisce con put(ID, t)
        _data.put(t.get_ID(),t);

    }

    public List<ToDo> getToDoList() {
        ArrayList lista= ((ArrayList) _data);
        // restituisce lista di tutti i TO-DO esistenti
        return null;
    }

    public void writeToFile(String fileName) {
        // serializzazione su file con writeObject: cfr. hints/InputOutput
    }
}

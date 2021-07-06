package part2.classTest.toDo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
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

    public static void loadFromFile() throws IOException, ClassNotFoundException {
        try (FileInputStream file = new FileInputStream(_fileName);
             ObjectInputStream in = new ObjectInputStream(file);)
        {
            _repository = (ToDoRepository)in.readObject();
        }

    }

    protected static ToDoRepository _repository=null;
    private static String _fileName ;                    // file da usare per serializzazione/deserializzazione
    private static boolean _init = false;               // flag che indica se il ToDoRepository è stato inizializzato

    private long idSeed;

    protected long getNewId() {
        return ++idSeed;
    }


    public static boolean init(String fileName) {
        try {
            Path p = Paths.get(fileName);
            _fileName = p.toString();
            _init = true;
        }
        catch(InvalidPathException ipe) {
            System.out.println(ipe.getMessage());
        }
        return _init;
    }

    public static ToDoRepository getRepo() throws Exception {
        if(!_init) {
            throw new Exception("ToDo Repository has not been initialized");
        }
        if(_repository == null) {
            if(!Files.exists(Paths.get(_fileName)))
                _repository = new ToDoRepository();
            else
                loadFromFile();
        }
        return _repository;
    }

    public static ToDoRepository getToDoRepository() {
        if(_repository == null) _repository = new ToDoRepository();
        return _repository;
    }

    public Map<Long, ToDo> _data = new HashMap<>();
    //cast da Map ad ArrayList


    public static void delete(Long ID) {
        _repository._data.remove(ID);
    };

    protected void add(ToDo t) {
        Long newid = getNewId();
        t.setID(newid);
        _repository._data.put(newid,t);
    }

    protected void update(ToDo t) {
        // si prende l'ID dall'oggetto t
        // si recupera dalla mappa il TO-DO corrispondente con get(t), per controllo
        // si sostituisce con put(ID, t)
         _repository._data.put(t.getID(),t);

    }

    public List<ToDo> getToDoList() {
        // restituisce lista di tutti i TO-DO esistenti
        List<ToDo> lToDo = new ArrayList<>() ;
        lToDo.addAll( _repository._data.values());
        return lToDo;
    }

    public void writeToFile() throws IOException {
        try(FileOutputStream file = new FileOutputStream(_fileName);
            ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(_repository);
        }
    }

    public static ToDo getToDo(Long id){
        return  _repository._data.get(id);
    }
}

package ires.corso.test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca implements Serializable {

    protected static Biblioteca _repository = null;
    private static String _fileName ;
    private static boolean _init = false;

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

    public static Biblioteca getRepo() throws Exception {
        if(!_init) {
            throw new Exception("Biblioteca Repository has not been initialized");
        }
        if(_repository == null) {
            if(!Files.exists(Paths.get(_fileName)))
                _repository = new Biblioteca();
            else
                loadFromFile();
        }
        return _repository;
    }

    public static void loadFromFile() throws IOException, ClassNotFoundException {
        try (FileInputStream file = new FileInputStream(_fileName);
             ObjectInputStream in = new ObjectInputStream(file);)
        {
            _repository = (Biblioteca)in.readObject();
        }

    }

    public static Biblioteca getBibliotecaRepository() {
        if(_repository == null) _repository = new Biblioteca();
        return _repository;
    }

    public Map<Long, Libro> _data = new HashMap<>();

    public static void delete(Long ID) {
        _repository._data.remove(ID);
    };

    protected void add(Libro l) {
        Long newid = getNewId();
        l.setID(newid);
        _repository._data.put(newid,l);
    }

    protected void update(Libro l) {
        _repository._data.put(l.getID(),l);
    }

    public List<Libro> getLibroList() {
        List<Libro> lLibro = new ArrayList<>() ;
        lLibro.addAll( _repository._data.values());
        return lLibro;
    }

    public static Libro getLibro(Long id){
        return _repository._data.get(id);
    }


    public void writeToFile() throws IOException {
        try(FileOutputStream file = new FileOutputStream(_fileName);
            ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(_repository);
        }
    }

}

package ires.corso.test2.test;

import part2.classTest.toDo.menu.ToDoMenuBranch;
import part2.classTest.toDo.menu.ToDoMenuLeaf;

import java.util.Arrays;

public class Applicazione  {

    private static Biblioteca repository;

    public static void main(String[] args) throws Exception {
        final String fileIniziale = "biblioteca.ser";
        boolean inizializzato = Biblioteca.init(fileIniziale);
        repository = Biblioteca.getRepo();
        ToDoMenuBranch menu = createMenu();
        menu.run();
        repository.writeToFile();

    }

    private static ToDoMenuBranch createMenu() {

        ToDoMenuLeaf perTitolo = new ToDoMenuLeaf("1", "Per titolo", LibroList::viewByTitolo );
        ToDoMenuBranch visualizzaMenu = new ToDoMenuBranch("1", "Visualizza", Arrays.asList( perTitolo ));

        ToDoMenuLeaf addLibro = new ToDoMenuLeaf("1", "Aggiungi", LibroManager::createNewLibro );
        ToDoMenuLeaf removeLibro = new ToDoMenuLeaf("2", "Rimuovi", LibroManager::removeLibro );
        ToDoMenuLeaf editLibro = new ToDoMenuLeaf("3", "Modifica", LibroManager::updateLibro );
        ToDoMenuBranch editMenu = new ToDoMenuBranch("2", "Aggiungi, Rimuovi, Modifica", Arrays.asList(addLibro, removeLibro, editLibro));

        ToDoMenuLeaf avanzamentoLettura = new ToDoMenuLeaf("1", "Avanza nella lettura", LibroManager::avanzamentoLettura );
        ToDoMenuLeaf giudizioPersonale = new ToDoMenuLeaf("2", "Dai un voto", LibroManager::giudizio );
        ToDoMenuBranch leggiValuta = new ToDoMenuBranch("3", "Leggi/Valuta", Arrays.asList( avanzamentoLettura, giudizioPersonale ));

        ToDoMenuBranch mainMenu = new ToDoMenuBranch("MainMenu", "Menu Principale", Arrays.asList( visualizzaMenu, editMenu, leggiValuta ), "5", "Esci");
        return mainMenu;
    }
}
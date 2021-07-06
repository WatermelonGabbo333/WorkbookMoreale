package part2.classTest.toDo;

import part2.classTest.toDo.menu.ToDoMenuBranch;
import part2.classTest.toDo.menu.ToDoMenuLeaf;

import java.io.IOException;
import java.util.Arrays;

public class ToDoApplication
{
    // 1. Deserializza il repository da file (carica i dati dell'ultimo salvataggio)
    //    creando una classe Repository
    // 2. Gestione del MENU principale con un loop e due switch
    // 3. In corrispondenza di una scelta dell'utente (ramo dello switch) chiama
    //    le classi necessarie per svolgere l'azione
    // 4. Chiede conferma e serializza in uscita
    // 5. Fornisce anche i metodi della classe "lettore" di quiz... askForInput , display
    private static ToDoRepository repository;

    public static void main(String[] args) throws Exception {
        final String fileIniziale = "todos.txt";
        boolean inizializzato = ToDoRepository.init(fileIniziale);
        repository = ToDoRepository.getRepo();
        ToDoMenuBranch menu = createMenu();
        menu.run();
        repository.writeToFile();
    }

    private static ToDoMenuBranch createMenu() {

        ToDoMenuLeaf byPriority = new ToDoMenuLeaf("1", "Per priorità", ToDoList::viewByPriority );
        ToDoMenuLeaf byDate = new ToDoMenuLeaf("2", "Per data", ToDoList::viewByDate );
        ToDoMenuLeaf byState = new ToDoMenuLeaf("3", "Per stato", ToDoList::viewByStatus );
        ToDoMenuBranch visualizzaMenu = new ToDoMenuBranch("1", "Visualizza", Arrays.asList( byPriority, byDate, byState ));

        ToDoMenuLeaf addToDo = new ToDoMenuLeaf("1", "Aggiungi", ToDoManager::createNewToDo );
        ToDoMenuLeaf removeToDo = new ToDoMenuLeaf("2", "Rimuovi", ToDoManager::removeToDo );
        ToDoMenuLeaf editToDo = new ToDoMenuLeaf("3", "Modifica", ToDoManager::updateToDo );
        ToDoMenuBranch editMenu = new ToDoMenuBranch("2", "Aggiungi, Rimuovi, Modifica", Arrays.asList(addToDo, removeToDo, editToDo));

        ToDoMenuLeaf exportToDo = new ToDoMenuLeaf("1", "Export su file", ToDoImportExport::exportToFile );
        ToDoMenuLeaf importToDo = new ToDoMenuLeaf("2", "Import da file", ToDoImportExport::importToFile );
        ToDoMenuBranch importExportMenu = new ToDoMenuBranch("3", "Import/Export", Arrays.asList( exportToDo, importToDo ));

        ToDoMenuBranch mainMenu = new ToDoMenuBranch("MainMenu", "Menu Principale", Arrays.asList( visualizzaMenu, editMenu, importExportMenu ), "4", "Esci");
        return mainMenu;
    }
}
package part2.classTest.toDo;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToDoList
{
    // Implementa le funzionalità di visualizzazione con:
    // - ordinamento per priorità
    // - ordinamento per data
    // - ordinamento per stato
    // Si appoggia a un metodo di ToDoRepository per avere una lista (= copia dei TO-DO
    // originali) dei TO-DO attualmente a sistema, cioè un ArrayList facilmente utilizzabile

    public static void viewByPriority(){
        List<ToDo> lToDo = ToDoRepository.getToDoRepository().getToDoList();
        Collections.sort(lToDo,(ToDo t1,ToDo t2) -> t1.getPriorità().compareTo(t2.getPriorità()));
        stampa(lToDo);
    }

    public static void viewByDate(){
        List<ToDo> lToDo = ToDoRepository.getToDoRepository().getToDoList();
        Collections.sort(lToDo, (ToDo t1,ToDo t2) -> t1.getDataConsegna().compareTo(t2.getDataConsegna()));
        stampa(lToDo);
    }

    public static void viewByStatus(){
        List<ToDo> lToDo = ToDoRepository.getToDoRepository().getToDoList();
        Collections.sort(lToDo, (ToDo t1, ToDo t2) -> t1.getStato().compareTo(t2.getStato()));
       stampa(lToDo);
    }

    public static void stampa(List<ToDo> lToDo){
       //lToDo.forEach(t -> System.out.println(t.prettyPrint()));

        for (ToDo t : lToDo){
            System.out.println(t.prettyPrint());
        }


    }



}
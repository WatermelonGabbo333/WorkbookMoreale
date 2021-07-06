package part2.classTest.toDo;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ToDoImportExport {
    // Gestisce import/export da file
    // Mantiene i formati di import e di export (conversione da/verso stringa)

    private static String convertToString(ToDo t) {
        String singola = t.get_ID() +";"+t.getTitolo()+";"+t.getDescrizione()+";"+t.getDataInserimento()+";"+t.getDataConsegna()+";"+t.getPriorità()+";"+t.getStato();
        return singola;
    }
    //da _repository.to-do a String in file
    //scrivo su file

    public static void exportToFile() {

        try (PrintWriter outputStream = new PrintWriter(new FileWriter(chiediNome()))) {
            List<ToDo> toDoList = ToDoRepository.getToDoRepository().getToDoList();
            Iterator<ToDo> tdi = toDoList.iterator();

            while (tdi.hasNext()) {
                String sToDo = convertToString(tdi.next());
                outputStream.println(sToDo);
            }
        } catch (IOException ioe){
            System.out.println("Errore nella scrittura");
        }
    }

    // da String su file a List<to-do> per poi _repository
    public static void importToFile() {

        ArrayList<String> fileLines = new ArrayList<>();

        try (BufferedReader inputStream = new BufferedReader(new FileReader(chiediNome()))) {
            String l;
            while ((l = inputStream.readLine()) != null) {
                fileLines.add(l);
            }
        } catch (IOException ioe){
            System.out.println("Errore nella lettura");
        }
        // Loop di conversione da stringhe (linne file) a oggetti TO-DO
        int contaToDo=0;
        for (String s : fileLines){
            if (s!=null){
                String[] linea= s.split(";");
                ToDo t = new ToDo();
                t.set_ID(Long.parseLong(linea[0]));
                t.setTitolo(linea[1]);
                t.setDescrizione(linea[2]);
                t.setDataInserimento(LocalDate.parse(linea[3]));
                t.setDataConsegna(LocalDate.parse(linea[4]));
                t.setPriorità(ToDo.Priorità.valueOf(linea[5]));
                t.setStato(ToDo.Stato.valueOf(linea[6]));
                ToDoRepository._repository.add(t);
                contaToDo++;
            }else{
                System.out.println("Ho saltato una riga per nome nullo...");
            }
        }
        System.out.printf("Ho importato %d todo",contaToDo);

    }

    public static String chiediNome(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il nome del file finendo con .txt");
        String fileName = in.nextLine();
        return fileName;
    }
}
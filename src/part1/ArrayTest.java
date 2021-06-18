package part1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        inputIndice();
        inputDoppiStringa();
    }

    public static int indiceMethod(int[] arrayInt, int num){
        int indice=-1;
        for (int i=0;i<arrayInt.length;i++){
            if (arrayInt[i]==num){
                indice = i;
                break;
            }
        }
        return indice;
    }

    public static void inputIndice(){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un array : ");
        String riga = input.nextLine();
        String[] arrayString = riga.split(" ");
        int[] arrayInt = new int[arrayString.length];
        for (int i=0;i<arrayString.length;i++){
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }
        System.out.println("Di quale numero vuoi sapere la posizione ? : ");
        int num = input.nextInt();
        int posizione = indiceMethod(arrayInt,num);
        System.out.println("La posizione dell'indice è : " + posizione);
    }

    public static int[] rimuoviDoppi(int[] arrayDuplicato){

        return new int[]{1,2,3};
    }

    public static void inputDoppiStringa(){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un array : ");
        String riga = input.nextLine();
        String[] arrayString = riga.split(" ");
        String stringaPulita = Arrays.stream(arrayString).distinct().toString();
        System.out.println("L'array senza doppi è : " + stringaPulita);
    }

    public static void stampaArray(){

    }

    public static void inputDoppiNormale(){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un array : ");
        String riga = input.nextLine();
        String[] arrayString = riga.split(" ");
        Arrays.stream(arrayString).distinct();
        int[] arrayInt = new int[arrayString.length];
        for (int i=0;i<arrayString.length;i++){
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }
        int[] arrayPulito = rimuoviDoppi(arrayInt);
        System.out.println("L'array senza doppi è : " + arrayPulito);
    }
}

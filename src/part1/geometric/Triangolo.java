package part1.geometric;

import java.util.Scanner;

public class Triangolo {

    public static double b;
    public static double h;

    public static void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci la base : ");
        b = in.nextDouble();
        System.out.println("Inserisci l'altezza : ");
        h = in.nextDouble();
    }

    public static void computeArea(){
        System.out.println("L'area del triangolo è : " + b*h/2);
    }
}

package part1.geometric;

import java.util.Scanner;

public class Trapezio {

    public static double B;
    public static double b;
    public static double h;

    public static void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci la base maggiore : ");
        B = in.nextDouble();
        System.out.println("Inserisci la base minore : ");
        b = in.nextDouble();
        System.out.println("Inserisci l'altezza : ");
        h = in.nextDouble();
    }

    public static void computeArea(){
        System.out.println("L'area del trapezio è : " + (B+b)*h/2);
    }
}

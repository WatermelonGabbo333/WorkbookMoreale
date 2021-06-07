package part1.geometric;

import java.util.Scanner;

public class Quadrato {

    public static double l;

    public static void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il lato : ");
        l = in.nextDouble();
    }

    public static void computeArea(){
        System.out.println("L'area del quadrato è : " + l*l);
    }
}

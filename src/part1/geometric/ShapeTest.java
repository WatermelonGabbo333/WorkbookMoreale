package part1.geometric;

import java.util.Scanner;

public class ShapeTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Quale figura vuoi usare? : ");
        String figura = in.next();

        switch (figura){

            case "trapezio":
                Trapezio.input();
                Trapezio.computeArea();
                break;

            case "quadrato":
                Quadrato.input();
                Quadrato.computeArea();
                break;

            case "triangolo":
                Triangolo.input();
                Triangolo.computeArea();
                break;

            default:
                System.out.println("Figura non presente in archivio");
        }

    }
}

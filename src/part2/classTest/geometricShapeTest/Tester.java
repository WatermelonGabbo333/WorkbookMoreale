package part2.classTest.geometricShapeTest;

import java.awt.geom.Area;

public class Tester {
    public static void main(String[] args) {
        Quadrato quadrato1 = new Quadrato(5);
        Triangolo triangolo1 = new Triangolo(5,3,5,4,4);
        Trapezio trapezio1 = new Trapezio(5,7,2,5,7,3,4);

        MasterShape ms1 = (MasterShape) quadrato1;
        MasterShape ms2 = (MasterShape) triangolo1;
        MasterShape ms3 = (MasterShape) trapezio1;

        MasterShape[] figure = new MasterShape[3];

        figure[0] = quadrato1;
        figure[1] = triangolo1;
        figure[2] = trapezio1;

        for (int i=0;i< figure.length;i++){
            System.out.printf("Area %d = ",i+1);
            figure[i].computeArea();
            System.out.println(figure[i].getArea());
            System.out.printf("Perimetro %d = ",i+1);
            figure[i].computePerimeter();
            System.out.println(figure[i].getPerimeter());
        }

    }
}

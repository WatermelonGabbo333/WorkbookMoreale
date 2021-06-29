package part2.classTest.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pagelle {
    public static void main(String[] args) {

        Student s1 = new Student("Mario","Rossi","1a");
        Student s2 = new Student("Mario","Bianchi","2b");
        Student s3 = new Student("Mario","Azzurri","3c");

        Course c1 = new Course("Algebra","Si gioca con i numeri","Matematica");
        Course c2 = new Course("Analisi","Usiamo i numeri","Matematica");
        Course c3 = new Course("Geometria","Si gioca con le figure","Matematica");

//inizio corso 1
        Assignment a1 = new Assignment("Numeri primi","Calcola");
        Map<Student,Double> assignment1 = new HashMap<>();
        assignment1.put(s1,5.0);
        assignment1.put(s2,7.0);
        assignment1.put(s3,8.0);

        Assignment a2 = new Assignment("Fibonacci","Calcola");
        Map<Student,Double> assignment2 = new HashMap<>();
        assignment2.put(s1,7.0);
        assignment2.put(s2,9.0);
        assignment2.put(s3,4.0);

        Map<Assignment,Map<Student,Double>> corso1 = new HashMap<>();
        corso1.put(a1,assignment1);
        corso1.put(a2,assignment2);

        c1.setValutazioni(corso1);

//inizio corso2
        Assignment a3 = new Assignment("Variante","Calcola");
        Map<Student,Double> assignment3 = new HashMap<>();
        assignment3.put(s1,6.0);
        assignment3.put(s2,10.0);
        assignment3.put(s3,8.0);

        Assignment a4 = new Assignment("Covariante","Calcola");
        Map<Student,Double> assignment4 = new HashMap<>();
        assignment4.put(s1,5.0);
        assignment4.put(s2,8.0);
        assignment4.put(s3,5.0);

        Map<Assignment,Map<Student,Double>> corso2 = new HashMap<>();
        corso2.put(a1,assignment1);
        corso2.put(a2,assignment2);

        c2.setValutazioni(corso2);

//inizio corso3
        Assignment a5 = new Assignment("Secante","Calcola");
        Map<Student,Double> assignment5 = new HashMap<>();
        assignment5.put(s1,9.0);
        assignment5.put(s2,9.0);
        assignment5.put(s3,7.0);


        Assignment a6 = new Assignment("Tangente","Calcola");
        Map<Student,Double> assignment6 = new HashMap<>();
        assignment6.put(s1,10.0);
        assignment6.put(s2,8.0);
        assignment6.put(s3,7.0);

        Map<Assignment,Map<Student,Double>> corso3 = new HashMap<>();
        corso3.put(a1,assignment1);
        corso3.put(a2,assignment2);

        c3.setValutazioni(corso3);

//medie voti per corso per studente
        System.out.println("Media corso Algebra primo studente : ");
        System.out.println((assignment1.get(s1)+assignment2.get(s1))/2);
        System.out.println("Media corso Algebra secondo studente : ");
        System.out.println((assignment1.get(s2)+assignment2.get(s2))/2);
        System.out.println("Media corso Algebra terzo studente : ");
        System.out.println((assignment1.get(s3)+assignment2.get(s3))/2);

        System.out.println("Media corso Analisi primo studente : ");
        System.out.println((assignment3.get(s1)+assignment4.get(s1))/2);
        System.out.println("Media corso Analisi secondo studente : ");
        System.out.println((assignment3.get(s2)+assignment4.get(s2))/2);
        System.out.println("Media corso Analisi terzo studente : ");
        System.out.println((assignment3.get(s3)+assignment4.get(s3))/2);

        System.out.println("Media corso Geometria primo studente : ");
        System.out.println((assignment5.get(s1)+assignment6.get(s1))/2);
        System.out.println("Media corso Geometria secondo studente : ");
        System.out.println((assignment5.get(s2)+assignment6.get(s2))/2);
        System.out.println("Media corso Geometria terzo studente : ");
        System.out.println((assignment5.get(s3)+assignment6.get(s3))/2);

//medie voti per assignment
        System.out.println("Media assignment 1 : ");
        System.out.println((assignment1.get(s1)+assignment1.get(s2)+assignment1.get(s3))/3);
        System.out.println("Media assignment 2 : ");
        System.out.println((assignment2.get(s1)+assignment2.get(s2)+assignment2.get(s3))/3);
        System.out.println("Media assignment 3 : ");
        System.out.println((assignment3.get(s1)+assignment3.get(s2)+assignment3.get(s3))/3);
        System.out.println("Media assignment 4 : ");
        System.out.println((assignment4.get(s1)+assignment4.get(s2)+assignment4.get(s3))/3);
        System.out.println("Media assignment 5 : ");
        System.out.println((assignment5.get(s1)+assignment5.get(s2)+assignment5.get(s3))/3);
        System.out.println("Media assignment 6 : ");
        System.out.println((assignment6.get(s1)+assignment6.get(s2)+assignment6.get(s3))/3);
    }
}

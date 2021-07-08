package part3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class LambdaAssignment {

    public static List<String> studenti = Arrays.asList("Agnese","Stefano", "Niki", "Veronica", "GabrieleM", "Davide", "GabrieleG", "Alessandro", "Alberto", "Fabiola", "Alessio", "Daniele");

    public static void main(String[] args) {
        trasformaStudenti(studenti);
        trasformaNumeri2(intro());
    }
    public static void trasformaStudenti(List<String> studenti){
        studenti.stream().filter(stu1 -> stu1.length() >= 5).map(String::toUpperCase).forEach(System.out::println);
    }

    public static void trasformaNumeri(){
        Scanner input = new Scanner(System.in);
        System.out.println("Dammi dei numeri interi separati da virgola : (es. numero, numero)");
        Stream<String> numeriStringa = Arrays.stream(input.nextLine().trim().split(","));
        IntStream numeriInt = numeriStringa.mapToInt(Integer::parseInt);
        OptionalDouble tot = numeriInt.distinct().map(num->num*num).average();
        System.out.println(tot.getAsDouble());

    }

    public static void trasformaNumeri2(String riga){
        System.out.println(Arrays.stream(riga.trim().split(",")).mapToInt(Integer::parseInt).distinct().map(num->num*num).average().getAsDouble());
    }

    public static String intro(){
        Scanner input = new Scanner(System.in);
        System.out.println("Dammi dei numeri interi separati da virgola : (es. numero, numero)");
        return input.nextLine();
    }

}

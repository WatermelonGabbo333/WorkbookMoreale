package part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaAssignment {

    public static List<String> studenti = Arrays.asList("Agnese","Stefano", "Niki", "Veronica", "GabrieleM", "Davide", "GabrieleG", "Alessandro", "Alberto", "Fabiola", "Alessio", "Daniele");

    public static void main(String[] args) {
        trasformaStudenti(studenti);
    }
    public static void trasformaStudenti(List<String> studenti){
        studenti.stream().filter(stu1 -> stu1.length() >= 5).map(String::toUpperCase).forEach(System.out::println);
    }

}

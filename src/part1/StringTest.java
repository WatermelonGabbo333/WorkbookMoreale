package part1;

public class StringTest {

    public static void main(String[] args) {

        int contatore = args.length;

        if (contatore <3)
            System.out.println("Hai inserito meno di tre argomenti");
        else {
            System.out.println("Stampo le lunghezze:");

            System.out.println(args[0].length());
            System.out.println(args[1].length());
            System.out.println(args[2].length());

            System.out.println("Stampo i caratteri iniziali:");


            System.out.println(args[0].charAt(0));
            System.out.println(args[1].charAt(0));
            System.out.println(args[2].charAt(0));

            System.out.println("Stampo i caratteri finali:");


            System.out.println(args[0].charAt(args[0].length() - 1));
            System.out.println(args[1].charAt(args[1].length() - 1));
            System.out.println(args[2].charAt(args[2].length() - 1));

            System.out.println("Stampo il report:");

            System.out.println("La stringa: " + args[0] + ", ha lunghezza: " + args[0].length() + ", comincia per: " + args[0].charAt(0) + " e finisce per: " + args[0].charAt(args[0].length() - 1));
            System.out.println("La stringa: " + args[1] + ", ha lunghezza: " + args[1].length() + ", comincia per: " + args[1].charAt(0) + " e finisce per: " + args[1].charAt(args[1].length() - 1));
            System.out.println("La stringa: " + args[2] + ", ha lunghezza: " + args[2].length() + ", comincia per: " + args[2].charAt(0) + " e finisce per: " + args[2].charAt(args[2].length() - 1));
        }

    }
}

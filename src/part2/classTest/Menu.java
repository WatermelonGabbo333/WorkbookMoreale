package part2.classTest;

public class Menu {
    public static void main(String[] args) {

        PrimoPiatto pastaColPomodoro = new PrimoPiatto("Pasta col pomodoro",2);
        pastaColPomodoro.prettyPrint();

        System.out.println();

        SecondoPiatto tagliataDiManzo = new SecondoPiatto("Tagliata di manzo",1);
        tagliataDiManzo.prettyPrint();

        System.out.println();

        Dessert tortaAlCioccolato = new Dessert("Torta al cioccolato",2);
        tortaAlCioccolato.prettyPrint();
    }
}

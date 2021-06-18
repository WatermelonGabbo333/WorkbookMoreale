package part2.classTest.giocoInterfacce;

import part2.classTest.giocoInterfacce.interfacce.Mostro;
import part2.classTest.giocoInterfacce.interfacce.Personaggio;
import part2.classTest.giocoInterfacce.interfacce.Umano;
import part2.classTest.giocoInterfacce.personaggi.Eroe;
import part2.classTest.giocoInterfacce.personaggi.Licantropo;
import part2.classTest.giocoInterfacce.personaggi.Vampiro;

public class Giochiamo {
    public static void main(String[] args) {

        //creo personaggi
        Eroe e = new Eroe();
        Licantropo l =new Licantropo(true);
        Vampiro v =new Vampiro();

        //casto a interfacce
        Umano u1 = e;
        Mostro m1 = l;
        Mostro m2 = v;

        //creo array mostri
        Mostro[] mostri = new Mostro[2];
        mostri[0]=m1;
        mostri[1]=m2;

        //gioco
        System.out.println("-------------------");
        System.out.println("Inizia la battaglia");
        System.out.println("-------------------\n");

        for (int i=0;i<3;i++){
            System.out.println("Turno "+(i+1));

            u1.combatti();

            m1.azzanna();
            m1.azzanna();
            m2.azzanna();

            System.out.println(u1.getForza());

            for (int j=0;j<mostri.length;j++){
                System.out.println(mostri[j].getForza());
            }
            System.out.println();
        }
        System.out.println("---------------------");
        System.out.println("La battaglia è finita ");
        System.out.println("---------------------");
    }
}

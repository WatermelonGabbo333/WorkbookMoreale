package part2.classTest.giocoInterfacce.personaggi;

import part2.classTest.giocoInterfacce.interfacce.Mostro;
import part2.classTest.giocoInterfacce.interfacce.Umano;

public class Licantropo implements Umano, Mostro {
    private boolean isUomo;
    protected int forzaUmano,forzaMostro;

    public Licantropo(boolean luna) {
        isUomo = !luna;
        if (luna){
            forzaMostro = 15;
            forzaUmano = 0;
        } else {
            forzaUmano = 10;
            forzaMostro = 0;
        }
    }

    @Override
    public void combatti() {
        if (isUomo)
            forzaUmano -=3;
    }

    @Override
    public void azzanna() {
        if (!isUomo)
            forzaMostro -=2;
    }

    @Override
    public String getForza() {
        return "Forza rimanente licantropo : \n" +
                "      come umano : "+forzaUmano+
                "\n      come mostro : "+forzaMostro;
    }
}

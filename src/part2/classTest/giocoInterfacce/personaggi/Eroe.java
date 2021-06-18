package part2.classTest.giocoInterfacce.personaggi;

import part2.classTest.giocoInterfacce.interfacce.Umano;

public class Eroe implements Umano {
    protected int forza;

    public Eroe() {
        forza = 10;
    }

    @Override
    public void combatti() {
        forza -=3;
    }

    @Override
    public String getForza() {
        return "Forza rimanente come eroe : " + forza;
    }
}

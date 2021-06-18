package part2.classTest.giocoInterfacce.personaggi;

import part2.classTest.giocoInterfacce.interfacce.Mostro;

public class Vampiro implements Mostro {

    protected int forza;

    public Vampiro() {
        forza = 15;
    }

    @Override
    public void azzanna() {
        forza -=2;
    }

    @Override
    public String getForza() {
        return "Forza rimanente come vampiro : " +forza;
    }
}

package part2.classTest;

public class SecondoPiatto {

    private String nome;
    private int porzioni;
    private boolean arrivato = false;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPorzioni() {
        return porzioni;
    }

    public void setPorzioni(int porzioni) {
        this.porzioni = porzioni;
    }

    public boolean isArrivato() {
        return arrivato;
    }

    public void setArrivato(boolean arrivato) {
        this.arrivato = arrivato;
    }

    public SecondoPiatto(String nome, int porzioni){
        setNome(nome);
        setPorzioni(porzioni);
    }

    public void prettyPrint(){
        System.out.println("Sta arrivando il secondo . . . ");
        System.out.printf("Ecco servito %d di %s",this.porzioni ,this.nome);
        setArrivato(true);
    }
}

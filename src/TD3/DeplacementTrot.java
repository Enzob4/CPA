package TD3;

public class DeplacementTrot implements StrategieDeplacement {
    private int pente=0;

    public void setPente(int pente) {
        this.pente = pente;
    }

    @Override
    public void seDeplacer() {
        if (pente == 0)
            System.out.println("Je trottine ...");
        else if (pente <0)
            System.out.println("Je dévale la pente");
        else
            System.out.println("Je monte la pente");
    }
}

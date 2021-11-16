package TD3;

public abstract class Personnage {
    private StrategieDeplacement strategieDeplacement;
    private StrategieCombat strategieCombat;

    public Personnage(StrategieDeplacement strategieDeplacement, StrategieCombat strategieCombat){
        this.strategieDeplacement=strategieDeplacement;
        this.strategieCombat=strategieCombat;
    }

    public void seDeplacer(){
        strategieDeplacement.seDeplacer();
    }

    public void setStrategieDeplacement(StrategieDeplacement strategieDeplacement) {
        this.strategieDeplacement = strategieDeplacement;
    }

    public void setStrategieCombat(StrategieCombat strategieCombat) {
        this.strategieCombat = strategieCombat;
    }

    public StrategieDeplacement getStrategieDeplacement() {
        return strategieDeplacement;
    }

    public StrategieCombat getStrategieCombat() {
        return strategieCombat;
    }

    public void combattre(){
        strategieCombat.combattre();
    }

    public void attaquer(){
        seDeplacer();
        combattre();
    }

    public void seCacher(){
        System.out.println("Je ne suis plus là ...");
    }


}

package TD3;

public class Ecureuil extends Personnage {
    public Ecureuil() {
        super(new DeplacementArbres(), new CombatLancer("noisettes"));
    }
}

package TD3;

public class Mouffette extends Personnage{
    public Mouffette() {
        super(new DeplacementTrot(), new CombatJet("liquide malodorant"));
    }
}

package TD3;

public class CombatJet implements StrategieCombat{
    private String jet;


    public CombatJet(String jet) {
        this.jet = jet;
    }

    @Override
    public void combattre() {
        System.out.println("Je projette du "+jet+" !!!");
    }
}

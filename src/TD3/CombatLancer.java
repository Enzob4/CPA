package TD3;

public class CombatLancer implements StrategieCombat{

    private String projectiles;

    public CombatLancer(String projectiles) {
        this.projectiles = projectiles;
    }

    @Override
    public void combattre() {
        System.out.println("Je lance des "+projectiles+" !!!");
    }
}

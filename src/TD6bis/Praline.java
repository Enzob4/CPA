package TD6bis;

public class Praline extends DecorateurBonbon{
    public Praline(Seau s){
        seau=s;
    }

    @Override
    public String getLibelle() {
        return seau.getLibelle()+" pralines";
    }

    @Override
    public double getPrix() {
        return seau.getPrix()+1.25;
    }
}

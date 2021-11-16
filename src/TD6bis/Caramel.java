package TD6bis;

public class Caramel extends DecorateurBonbon {
    public Caramel(Seau s){
        seau =s;
    }

    @Override
    public String getLibelle() {
        return seau.getLibelle()+" caramels";
    }

    @Override
    public double getPrix() {
        return seau.getPrix()+1.75;
    }
}

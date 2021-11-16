package TD6bis;

public class Sucette extends DecorateurBonbon{
    public Sucette(Seau s){
        seau=s;
    }

    @Override
    public String getLibelle() {
        return seau.getLibelle()+" sucettes";
    }

    @Override
    public double getPrix() {
        return seau.getPrix()+2.;
    }
}

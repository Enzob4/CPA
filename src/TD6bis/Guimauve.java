package TD6bis;

public class Guimauve extends DecorateurBonbon{
    public Guimauve(Seau s){
        seau=s;
    }

    @Override
    public String getLibelle() {
        return seau.getLibelle()+" guimauves";
    }

    @Override
    public double getPrix() {
        return seau.getPrix()+1.5;
    }
}

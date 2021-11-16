package TD6;

public class Nutella extends DecorateurGaufre{
    public Nutella(Gaufre g){
        gaufre=g;
    }

    @Override
    public String getLibelle() {
        return gaufre.getLibelle()+" Nutella";
    }

    @Override
    public double getPrix() {
        return gaufre.getPrix()+ 1;
    }
}

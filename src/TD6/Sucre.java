package TD6;

public class Sucre extends DecorateurGaufre{
    public Sucre(Gaufre g){
        gaufre=g;
    }

    @Override
    public String getLibelle() {
        return gaufre.getLibelle()+" Sucre";
    }

    @Override
    public double getPrix() {
        return gaufre.getPrix()+ 0.5;
    }
}

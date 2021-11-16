package TD5;

public class AffichagePapier implements IObservateur{

    @Override
    public void actualiser(ISujet s) {
        if (s instanceof Quotidien){
            Quotidien quotidien = (Quotidien) s;
            System.out.println("Journal disponible dans votre boite aux lettre"+" numéro : "+quotidien.getNumero());

        }
    }
}

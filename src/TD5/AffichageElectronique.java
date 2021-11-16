package TD5;

public class AffichageElectronique implements IObservateur{

    @Override
    public void actualiser(ISujet s) {
        if (s instanceof Quotidien){
            Quotidien quotidien = (Quotidien) s;
            System.out.println("numéro : "+quotidien.getNumero()+" Titre : "+ quotidien.getTitreUne()+" Contenu à la une : "+quotidien.getContenuUne());

        }
    }
}

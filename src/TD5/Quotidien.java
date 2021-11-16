package TD5;

import java.util.List;
import java.util.ArrayList;

public class Quotidien implements ISujet{
    private int numero;
    private String titreUne;
    private String contenuUne;
    private ArrayList<IObservateur> listeObservateurs;


    public int getNumero() {
        return numero;
    }

    public String getTitreUne() {
        return titreUne;
    }

    public String getContenuUne() {
        return contenuUne;
    }

    public Quotidien(int numero, String titreUne, String contenuUne) {

        listeObservateurs = new ArrayList<IObservateur>();
        this.numero=numero;
        this.titreUne=titreUne;
        this.contenuUne=contenuUne;
    }

    public void ajouterObservateur(IObservateur o){
        listeObservateurs.add(o);
    }

    public void supprimerObservateur(IObservateur o){
        listeObservateurs.remove(o);
    }

    public void notifierObservateurs(){
        for (IObservateur o : listeObservateurs){
            o.actualiser(this);
        }
    }
}

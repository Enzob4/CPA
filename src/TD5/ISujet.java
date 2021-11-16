package TD5;

public interface ISujet {
    void ajouterObservateur(IObservateur o);

    void supprimerObservateur(IObservateur o);

    void notifierObservateurs();
}

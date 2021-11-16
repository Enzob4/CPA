package TD5;

public class ObservateurTest {

    public static void main(String[] args) {
        Quotidien quotidien = new Quotidien(1, "Gabriel dans le retro", "gabriel dans le retro d'Enzo le roi uqi lui a mis une tempete");

        quotidien.ajouterObservateur(new AffichagePapier());
        quotidien.ajouterObservateur(new AffichageElectronique());
        quotidien.ajouterObservateur(new AffichageNotif());

        quotidien.notifierObservateurs();
    }
}
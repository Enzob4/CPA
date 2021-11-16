package TD3;
public class TestStrategie {

// Si je dois créer un hérisson, j'ai juste la classe Herisson à ajouter
// Pas besoin de réécrire les méthodes de déplacement et de combat

    public static void main(String[] args) {
        Personnage riton,zamy,verne,porcu,oppo;
        riton = new Mouffette();
        zamy = new Ecureuil();
        verne = new Tortue();
        oppo=new Oppossum();
        porcu=new PorcEpic();

        riton.attaquer();
        zamy.attaquer();
        verne.attaquer();
        oppo.attaquer();
        porcu.attaquer();

        System.out.println("L'écureuil sort de la forêt ... plus d'arbres !");
        StrategieDeplacement deplZamy = new DeplacementTrot();
        zamy.setStrategieDeplacement(deplZamy);
        if (deplZamy instanceof DeplacementTrot)
            ((DeplacementTrot) deplZamy).setPente(-6);
        zamy.attaquer();
    }
}

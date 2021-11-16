package TD1;
public class Zoo {
    private String nom;
    private Animal[] tabzoo;
    private static final int MAX_ANIMAUX = 100;
    private int cpt;

    public Zoo(String nom){
        this.nom=nom;
        this.tabzoo=new Animal[MAX_ANIMAUX];
        int cpt=0;
    }

    public String getNom(){

        return nom;
    }

    public void afficher(){
        for(int i = 0;i<cpt;i++){
            tabzoo[i].afficher();
        }
    }

    public void addAnimalZoo(Animal A) throws TableauCompletException{
        if(this.cpt+1>MAX_ANIMAUX){
            throw new TableauCompletException();
        }
        else{
            tabzoo[cpt]=A;
            cpt++;
        }
    }

    public int nbTypes(String type){
        int nbTypeZoo=0;
        for(int i=0;i<cpt;i++){
            if(tabzoo[i].getClass().getSimpleName().equals(type)){
                nbTypeZoo++;
            }
        }
        return nbTypeZoo;
    }

    public static void main(String[] args) throws Exception{
        Zebre z1= new Zebre();

        Zoo zo1= new Zoo("Zoo");

        zo1.addAnimalZoo(z1);

        System.out.println(zo1.tabzoo[0].getClass().getSimpleName());
        System.out.println(zo1.nbTypes("Zebre"));

    }



}

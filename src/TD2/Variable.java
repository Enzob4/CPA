package TD2;

public class Variable extends ExpressionArithmetique {

    private String nom;
    private double valeur;

    public Variable(String nom,double valeur){
        this.nom=nom;
        this.valeur=valeur;
    }

    @Override
    public double eval() {
        return valeur;
    }

    @Override
    public String toString() {
        return nom;
    }
}

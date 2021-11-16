package TD6bis;

public abstract class Seau {
    private String libelle;
    private double prix;

    public String getLibelle(){return libelle;}

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Seau " +
                getLibelle() + " " +
                ", prix = " + getPrix();
    }
}

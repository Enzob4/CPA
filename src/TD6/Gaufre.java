package TD6;

public abstract class Gaufre {
    private String libelle;
    private double prix;
    public String getLibelle() {
        return libelle;
    }
    public double getPrix() {
        return prix;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public String toString() {
        return String.format("Gaufre %s, prix %s",
                getLibelle(),getPrix());
    }
}

package TD6;

public abstract class DecorateurGaufre extends Gaufre {
    protected Gaufre gaufre;
    public abstract String getLibelle();
    public abstract double getPrix();
}

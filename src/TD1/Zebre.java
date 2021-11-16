package TD1;

public class Zebre implements Animal {
    @Override
    public Alimentation alimentation() {
        return Alimentation.herbivore;
    }

    @Override
    public boolean vertebre() {
        return true;
    }

    @Override
    public String criAnimal() {
        return "hennissement";
    }

    @Override
    public void afficher() {
        System.out.print("Zebre : " + alimentation().toString() + "" + this.criAnimal() + "");

    }
}

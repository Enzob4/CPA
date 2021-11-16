package TD1;

public class Tigre implements Animal {

    @Override
    public Alimentation alimentation() {
        return Alimentation.carnivore;
    }

    @Override
    public boolean vertebre() {
        return true;
    }

    @Override
    public String criAnimal() {
        return "rugissement";
    }

    @Override
    public void afficher() {
        System.out.print("Tigre : " + alimentation().toString() + "" + this.criAnimal() + "");

    }
}

package TD6bis;

public class DecorateurTest {
    public static void main(String[] args) {
        Seau s1= new Caramel(new SeauCitrouille());
        Seau s2 = new Guimauve(new SeauSquelette());
        Seau s3 = new Guimauve(new Sucette(new SeauCitrouille()));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}

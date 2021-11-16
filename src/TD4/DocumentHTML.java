package TD4;

public class DocumentHTML implements IDocument {
    private DocumentHTML html;
    @Override
    public void setContenu(String contenu) {
        this.html=new DocumentHTML();
    }

    @Override
    public void affiche() {
        System.out.println(this.html);

    }

    @Override
    public void imprime() {

    }
}

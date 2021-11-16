package TD4;

public class AdaptateurPDF implements IDocument{
    private ComposantPDF pdf;

    public AdaptateurPDF(){
        pdf=new ComposantPDF();
    }

    public AdaptateurPDF(ComposantPDF pdf){
        this.pdf=pdf;
    }

    @Override
    public void setContenu(String contenu) {
        pdf.pdfFixeContenu(contenu);
    }

    @Override
    public void affiche() {
        pdf.pdfPrepareAffichage();
        pdf.pdfAffiche();
        pdf.pdfTermineAffichage();
    }

    @Override
    public void imprime() {
        pdf.pdfEnvoieImprimante();
    }
}

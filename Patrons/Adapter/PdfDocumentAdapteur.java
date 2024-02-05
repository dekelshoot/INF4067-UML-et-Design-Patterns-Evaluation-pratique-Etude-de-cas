package Patrons.Adapter;

public class PdfDocumentAdapteur implements Document{
    public String nom;
    public String type;
    public String contenu;
    public PdfDocument pdfDocument;

    public PdfDocumentAdapteur(String nom, String type , String contenu){
        this.type = type;
        this.contenu=contenu;
        this.nom = nom;    
    }

    @Override
    public String getContenu() {
        return this.contenu;
    }

    @Override
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public void afficherDocument() {
        System.out.println("Afficharge du document...\n\t Type: "+this.type+"\n\t Nom: "+this.nom+"\n\t Contenu: "+this.contenu);
    }

    @Override
    public void imprimerDocument() {
        this.pdfDocument.imprimerPdf(this.nom, this.contenu);
    }
    
}

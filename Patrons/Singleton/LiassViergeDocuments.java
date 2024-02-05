package Patrons.Singleton;

import Patrons.Adapter.Document;

public final class LiassViergeDocuments {
    private static LiassViergeDocuments liassViergeDocuments=null;
    private Document demandeImmatriculation;
    private Document certificatCession;
    private Document bonCommande;

    private LiassViergeDocuments(){}

    public static LiassViergeDocuments getInstance(){
        if(liassViergeDocuments == null){
            liassViergeDocuments = new LiassViergeDocuments();
            return liassViergeDocuments;
        }
        return liassViergeDocuments;
    }

    public void setDemandeImmatriculation(Document demandeImmatriculation){
        this.demandeImmatriculation = demandeImmatriculation;
    }
    public void setCertificatCession(Document certificatCession){
        this.certificatCession = certificatCession;
    }
    public void setBonCommande(Document bonCommande){
        this.bonCommande = bonCommande;
    }
    public Document getDemandeImmatriculation(){
        return this.demandeImmatriculation;
    }
    public Document getCertificatCession(){
        return this.certificatCession;
    }
    public Document getBonCommande(){
        return this.bonCommande;
    }

    public void afficherLiassDocument(){
        System.out.println("\tLiasse de document:\n");
        System.out.println("\t Demmande d'immatriculation: \n\t");
        this.demandeImmatriculation.afficherDocument();
        System.out.println("\t Certificat de cession: \n\t");
        this.certificatCession.afficherDocument();
        System.out.println("\t Bon de commande: \n\t");
        this.bonCommande.afficherDocument();
    }

    
}

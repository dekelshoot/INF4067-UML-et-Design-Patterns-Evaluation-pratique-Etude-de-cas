package Patrons.Singleton;

import Patrons.Adapter.Document;
import Patrons.Adapter.DocumentHtml;

public class Client {
    public static void main(String[] args) {
        Document doc1 = new DocumentHtml("Im1","immatriculation","La voiture de M. Dupont porte l'immatriculation AA-123-BB");
        Document doc2 = new DocumentHtml("Crt1","Certificat de Cession","M. Dupont et Mme Martin remplissent et signent un certificat de cession pour officialiser la vente.");
        Document doc3 = new DocumentHtml("Bcmd1","Bon de commande","M. Dupont et Mme Martin signent un bon de commande qui récapitule les conditions de la vente, notamment le prix de la voiture, les options choisies et la date de livraison.");

        LiassViergeDocuments liassViergeDocuments = LiassViergeDocuments.getInstance();
        liassViergeDocuments.setBonCommande(doc3);
        liassViergeDocuments.setCertificatCession(doc2);
        liassViergeDocuments.setDemandeImmatriculation(doc1);
        liassViergeDocuments.afficherLiassDocument();
    }
}

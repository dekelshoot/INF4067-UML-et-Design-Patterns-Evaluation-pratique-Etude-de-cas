package Patrons.Builder;

import Patrons.Singleton.LiassViergeDocuments;

import java.util.ArrayList;

import Patrons.FactoryMethod.Commande;
public class Directeur{
    MonteurLiassDocument monteurLiassDocument =new MonteurLiasseDocumentVehicule();
    public ArrayList<LiassViergeDocuments> construiLiasseDocuments(Commande commande){
        this.monteurLiassDocument.monteurDemandeImmatriculation(commande);
        this.monteurLiassDocument.monteurCertificatCession(commande);
        this.monteurLiassDocument.monteurBonCommande(commande);
        return this.monteurLiassDocument.getLiasseDocument();
    }
}


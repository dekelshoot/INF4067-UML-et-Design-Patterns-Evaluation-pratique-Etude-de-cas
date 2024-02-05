package Patrons.Builder;
import java.util.ArrayList;

import Patrons.Adapter.Document;
import Patrons.FactoryMethod.Commande;
import Patrons.Singleton.LiassViergeDocuments;

public abstract class MonteurLiassDocument {
    public ArrayList<LiassViergeDocuments> liassDocuments = new ArrayList<LiassViergeDocuments>();
    public abstract void monteurDemandeImmatriculation(Commande commande);
    public abstract void monteurCertificatCession(Commande commande);
    public abstract void monteurBonCommande(Commande commande);
    public abstract ArrayList<LiassViergeDocuments>  getLiasseDocument();
}

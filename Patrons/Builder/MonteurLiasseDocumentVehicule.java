package Patrons.Builder;
import java.util.ArrayList;

import Patrons.Adapter.Document;
import Patrons.Adapter.DocumentHtml;
import Patrons.FactoryMethod.Commande;
import Patrons.Singleton.LiassViergeDocuments;

public class MonteurLiasseDocumentVehicule extends MonteurLiassDocument{

    @Override
    public void monteurDemandeImmatriculation(Commande commande) {

        String cont = "Le "+commande.vehicules.get(0).type+" qui a l'identifiant "+commande.vehicules.get(0).id+" commander par "+commande.societeCliente.nomSociete+" porte l'immatriculation: "+commande.vehicules.get(0).id;
        Document immatriculation = new DocumentHtml("im", "Demmande d'immatriculation", cont);
        for(int i=0; i<commande.vehicules.size(); i++){
            LiassViergeDocuments liass = LiassViergeDocuments.getInstance();
            liass.setDemandeImmatriculation(immatriculation);
            this.liassDocuments.add(liass);
        }
        
    }

    @Override
    public void monteurCertificatCession(Commande commande) {
        String cont = "La "+commande.vehicules.get(0).type+" qui a l'identifiant "+commande.vehicules.get(0).id+" commander par "+commande.societeCliente.nomSociete+" remplissent et signent un certificat de cession pour officialiser la vente.";
        Document certificatCession = new DocumentHtml("CC", "Certificat Cession", cont);
        for(int i=0; i<commande.vehicules.size(); i++){
            LiassViergeDocuments liass = liassDocuments.get(i);
            liass.setCertificatCession(certificatCession);
            this.liassDocuments.set(i,liass);
        }
    }

    @Override
    public void monteurBonCommande(Commande commande) {
      String cont = commande.societeCliente.nomSociete+" et Design pattern signent un bon de commande qui récapitule les conditions de la vente, notamment le prix de la voiture, les options choisies et la date de livraison";
      Document bonCommande = new DocumentHtml("BCmd", "Bon de commande", cont);
      for(int i=0; i<commande.vehicules.size(); i++){
        LiassViergeDocuments liass = liassDocuments.get(i);
        liass.setBonCommande(bonCommande);
        this.liassDocuments.set(i,liass);
    }
    }

    @Override
    public ArrayList<LiassViergeDocuments> getLiasseDocument() {
        return  liassDocuments;
    }
    
}

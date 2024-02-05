package Patrons.FactoryMethod;
import java.util.ArrayList;
import Patrons.AbstractFactory.Vehicule;

public abstract class Commande {
    public String paysLivraison;
    public String etat;
    public String type;
    public float montantTtc;
    public float montantHt;
    public float montantTva;
    public ArrayList<Vehicule> vehicules;

    public Commande(ArrayList<Vehicule> vehicules, String paysLivraison){
        this.vehicules = vehicules;
        this.etat = etat;
        this.paysLivraison =paysLivraison;
        this.montantHt= this.calculerMontant();
        this.etat = "encours";
    }

    public void annuler(){
        this.etat = "Annulé";
    }

    public void complet(){
        this.etat = "complet";
    }

    public float calculerMontant(){
        float montant = 0;
        for(Vehicule vehicle :vehicules){
            montant += vehicle.prix;
        }
        return montant;
    };

    public void ajouterCommand(Vehicule vehicule){
        this.vehicules.add(vehicule);
        this.montantHt= this.calculerMontant();
    }
    public void afficherFacture(){
        System.out.println("\n\t Facture: ");
        System.out.println("\t id \t\t Nom \t\t Prix");
        for(Vehicule vehicle :vehicules){
            System.out.println("\t " + vehicle.id + " \t\t " +vehicle.nom+ " \t\t " + vehicle.prix);
        }
        System.out.println("\n\t Total " + this.montantHt  );
    }

}

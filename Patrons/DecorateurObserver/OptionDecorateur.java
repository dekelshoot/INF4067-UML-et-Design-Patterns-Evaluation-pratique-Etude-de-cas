package Patrons.DecorateurObserver;

import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;

public class OptionDecorateur extends DecorateurAfficheVehicule {
 public ArrayList<Vehicule> vehicules = new ArrayList<>();
    
    public OptionDecorateur(AfficherVehicule afficherVehicule) {
        super(afficherVehicule);
        this.vehicules = afficherVehicule.vehicules;
    }

    @Override
    public void afficherVehicule(){
        for(Vehicule v: this.vehicules){
            System.out.println("\n\t type: " + v.type+"\n\t id: "+v.id+"\n\t nom: " + v.nom+"\n\t carburation: "+v.carburation+"\n\t prix: " + v.prix+"\n\t date d'ajout: "+v.dateAjout );
            System.out.println("\t options: ");
            for (String element : v.options) {
                System.out.println("\t\t - " + element);
            }

        }
        
    }
    
}

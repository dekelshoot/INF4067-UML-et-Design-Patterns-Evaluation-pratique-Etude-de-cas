package Patrons.DecorateurObserver;

import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;

public class ImagesDecorateur extends DecorateurAfficheVehicule {

    
    public ImagesDecorateur(AfficherVehicule afficherVehicule) {
        super(afficherVehicule);
        this.vehicules = afficherVehicule.vehicules;
    }

    @Override
    public void afficherVehicule(){
        for(Vehicule v: this.vehicules){
            System.out.println("\n\t type: " + v.type+"\n\t id: "+v.id+"\n\t nom: " + v.nom+"\n\t carburation: "+v.carburation+"\n\t prix: " + v.prix+"\n\t date d'ajout: "+v.dateAjout );
            System.out.println("\t Images: ");
            for (String element : v.images) {
                System.out.println("\t\t - " + element);
            }

        }
        
    }
}
